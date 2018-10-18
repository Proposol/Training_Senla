package by.senla.lesson3;

public class Aplle extends Product {
    private String nameSort ;

    protected Aplle(String nameProvider, int weight){
        super(nameProvider,weight);
    }
    public String getNameSort() {
        return nameSort;
    }

    public void setNameSort(String nameSort) {
        this.nameSort = nameSort;
    }



}
