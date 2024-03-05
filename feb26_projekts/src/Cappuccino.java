public class Cappuccino extends Coffee{
    private String typeOfMilk;
    private int typeOfFoam;
    public Cappuccino(double price,boolean steamedMilk, boolean foam, String typeOfMilk, int typeOfFoam){
        super(price, steamedMilk, foam, false, false);
        this.typeOfMilk = typeOfMilk;
        this.typeOfFoam = typeOfFoam;
    }
    public void printInfo(){
        System.out.println("Price: "+getPrice()+
                "\nOrder: Cappuccino\nRecpie: \n   1 Espresso shot\n   Steamed Milk: "+typeOfMilk+"\n   "+typeOfFoam+"% Foam");
    }
    public String writeInfo(){
        return("Price: "+getPrice()+
                "\nOrder: Cappuccino\nRecpie: \n   1 Espresso shot\n   Steamed Milk: "+typeOfMilk+"\n   "+typeOfFoam+"% Foam");
    }
}
