package by.senla.lesson3;

public class Milk extends Product {
    private int getFatContent;

    public int getGetFatContent() {
        return getFatContent;
    }

    public void setGetFatContent(int getFatContent) {
        this.getFatContent = getFatContent;
    }



    protected Milk(String nameProvider , int weight){
        super(nameProvider,weight);
    }

}
