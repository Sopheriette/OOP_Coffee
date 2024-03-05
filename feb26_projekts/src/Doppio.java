public class Doppio extends Coffee{
    private String brandOfEspresso;
    public Doppio(double price,boolean extraEspresso, String brandOfEspresso){
        super(price, false, false, false, extraEspresso);
        this.brandOfEspresso = brandOfEspresso;
    }
    public void printInfo(){
        System.out.println("Price: "+getPrice()+
                "\nOrder: Doppio\nRecipe: \n   2 Espresso shots: "+brandOfEspresso);
    }
    public String writeInfo(){
        return("Price: "+getPrice()+
                "\nOrder: Doppio\nRecipe: \n   2 Espresso shots: "+brandOfEspresso);
    }
}
