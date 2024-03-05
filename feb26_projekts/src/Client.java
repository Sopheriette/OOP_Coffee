public class Client{
    private String name;
    private boolean card;

    public Client(String name, boolean card){
        this.name = name;
        this.card = card;
    }
    public void printInfo(){
        System.out.println("Name: "+getName()+"\nCard: "+isCard());
    }
    public String writeInfo(){
        return("Name: "+getName()+"\nCard: "+isCard());
    }

    public String getName() {
        return name;
    }
    public boolean isCard() {
        return card;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setCard(boolean card) {
        this.card = card;
    }
}
