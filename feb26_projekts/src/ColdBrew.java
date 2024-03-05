public class ColdBrew extends Coffee{
    private int icePieces;
    public ColdBrew(double price, boolean ice, int icePieces){
        super(price, false, false, ice, false);
        this.icePieces = icePieces;
    }
    public void printInfo(){
        System.out.println("Price: "+getPrice()+
                "\nOrder: Cold Brew\nRecipe: \n   1 Espresso shot\n   "+icePieces+" pieces of Ice");
    }
    public String writeInfo(){
        return("Price: "+getPrice()+
                "\nOrder: Cold Brew\nRecipe: \n   1 Espresso shot\n   "+icePieces+" pieces of Ice");
    }
}

