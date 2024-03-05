public class Coffee {
    private double price;
    private boolean steamedMilk;
    private boolean foam;
    private boolean ice;
    private boolean extraEspresso;

    public Coffee(double price, boolean steamedMilk, boolean foam, boolean ice, boolean extraEspresso) {
        this.price = price;
        this.steamedMilk = steamedMilk;
        this.foam = foam;
        this.ice = ice;
        this.extraEspresso = extraEspresso;
    }

    //    public Coffee(double price,boolean foam, boolean ice, boolean sugar){
//        this.price = price;
//        this.foam = foam;
//        this.ice = ice;
//        this.sugar = sugar;
//        this.steamedMilk = true;
//    }
    public Coffee(double price) {
        this.price = price;
    }

    public void printInfo() {
        System.out.println("Price: " + price +
                "\nOrder: Espresso\nRecipe: \n   1 espresso shot");
    }
    public String writeInfo() {
        return("Price: " + price +
                "\nOrder: Espresso\nRecipe: \n   1 espresso shot");
    }

    public double getPrice() {
        return price;
    }
    public boolean isSteamedMilk() {
        return steamedMilk;
    }
    public boolean isFoam() {
        return foam;
    }
    public boolean isIce() {
        return ice;
    }
    public boolean isExtraEspresso() {
        return extraEspresso;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public void setSteamedMilk(boolean steamedMilk) {
        this.steamedMilk = steamedMilk;
    }
    public void setFoam(boolean foam) {
        this.foam = foam;
    }
    public void setIce(boolean ice) {
        this.ice = ice;
    }
    public void setExtraEspresso(boolean extraEspresso) {
        this.extraEspresso = extraEspresso;
    }
}
