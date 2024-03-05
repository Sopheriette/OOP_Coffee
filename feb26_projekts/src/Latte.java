public class Latte extends Coffee{
    private String typeOfMilk;
    public Latte(double price,boolean steamedMilk, String typeOfMilk){
        super(price, steamedMilk, false, false, false);
          this.typeOfMilk = typeOfMilk;
    }
    public void printInfo(){
        System.out.println("Price: "+getPrice()+
                "\nOrder: Latte\nRecipe: \n   1 Espresso shot\n   Steamed Milk: "+typeOfMilk);
    }
    public String writeInfo(){
        return("Price: "+getPrice()+
                "\nOrder: Latte\nRecipe: \n   1 Espresso shot\n   Steamed Milk: "+typeOfMilk);
    }

    public String getTypeOfMilk() {
        return typeOfMilk;
    }

    public void setTypeOfMilk(String typeOfMilk) {
        this.typeOfMilk = typeOfMilk;
    }
}
