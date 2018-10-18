package by.senla.lesson3;

public abstract class Product {
    private int weight;
    private String nameProvider;

    protected Product(String nameProvider, int weight) {
        this.nameProvider = nameProvider;
        this.weight = weight;
    }

    public void setnameProvider(String nameProvider) {
        this.nameProvider = nameProvider;
    }

    public String getnameProvider() {
        return this.nameProvider;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return this.weight;
    }


}
