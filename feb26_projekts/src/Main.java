import java.io.FileWriter;
import java.io.IOException;
import java.net.ProtocolFamily;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 1;

        double paidWithCash = 0;
        double paidWithCard = 0;
        String yesNo;

        Coffee coffee = new Coffee(2.5);

        String name;
        Boolean card = false;

        boolean steamedMilk = coffee.isSteamedMilk();
        boolean foam = coffee.isFoam();
        boolean ice = coffee.isIce();
        boolean extraEspresso = coffee.isExtraEspresso();

        try {
            FileWriter fw = new FileWriter("Orders.txt");

            do {

                System.out.println("\nWelcome to the cafe!\nWhat is your name?");
                name = sc.nextLine();

                System.out.println("Do you want steamed milk? YES/NO");
                yesNo = sc.nextLine();
                if (yesNo.toLowerCase().contains("yes")) {
                    steamedMilk = true;
                } else {
                    steamedMilk = false;
                }
                System.out.println("Do you want foam? YES/NO");
                yesNo = sc.nextLine();
                if (yesNo.toLowerCase().contains("yes")) {
                    foam = true;
                } else {
                    foam = false;
                }
                System.out.println("Do you want ice? YES/NO");
                yesNo = sc.nextLine();
                if (yesNo.toLowerCase().contains("yes")) {
                    ice = true;
                } else {
                    ice = false;
                }
                System.out.println("Do you want extra espresso shot? YES/NO");
                yesNo = sc.nextLine();
                if (yesNo.toLowerCase().contains("yes")) {
                    extraEspresso = true;
                } else {
                    extraEspresso = false;
                }

                if (steamedMilk && !foam && !ice && !extraEspresso) {
                    System.out.println("Please enter the type of milk :");
                    String milkType = sc.nextLine();
                    coffee = new Latte(4.5, true, milkType);
                } else if (steamedMilk && foam && !ice && !extraEspresso) {
                    System.out.println("Please enter the type of milk :");
                    String milkType = sc.nextLine();
                    System.out.println("Please enter the type of foam(procents) :");
                    int foamType = Integer.parseInt(sc.nextLine());
                    coffee = new Cappuccino(3.5, true, true, milkType, foamType);
                } else if (!steamedMilk && !foam && ice && !extraEspresso) {
                    System.out.println("Please enter how much ice cubes you'd want :");
                    int cubeCount = Integer.parseInt(sc.nextLine());
                    coffee = new ColdBrew(3, true, cubeCount);
                } else if (!steamedMilk && !foam && !ice && extraEspresso) {
                    System.out.println("Please enter what brand of Espresso you'd want :");
                    String espressoBrand = sc.nextLine();
                    coffee = new Doppio(3, true, espressoBrand);
                } else {
                    coffee = new Coffee(2.5);
                }

                System.out.println("Will you pay by cash or by card?");
                String cashCard = sc.nextLine();
                if (cashCard.toLowerCase().contains("cash")) {
                    paidWithCash = coffee.getPrice() + paidWithCash;
                    card = true;
                } else if (cashCard.toLowerCase().contains("card")) {
                    paidWithCard = coffee.getPrice() + paidWithCard;
                    card = false;
                }

                Client client = new Client(name, card);

                System.out.println("\nThank you for your purchase! Here is your order!\n");

                System.out.print("==================\nOrder №" + count + "\n==================\n");
                client.printInfo();
                coffee.printInfo();
                System.out.print("==================\nPaid by card: " + paidWithCard +
                        "\nPaid by cash: " + paidWithCash + "\n==================");

                fw.write("==================\nOrder №" + count + "\n==================\n");
                fw.write(client.writeInfo());
                fw.write("\n"+coffee.writeInfo());
                fw.write("\n==================\nPaid by card: " + paidWithCard +
                        "\nPaid by cash: " + paidWithCash + "\n==================");
                count++;
            }while(count>0);
                fw.close();
        } catch(IOException e){
            System.out.println("An error has occured while creating the text file.");
        }
    }
}