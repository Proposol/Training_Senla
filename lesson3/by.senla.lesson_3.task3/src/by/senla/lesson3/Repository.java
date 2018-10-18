package by.senla.lesson3;

import java.nio.file.FileAlreadyExistsException;
import java.util.ArrayList;
import java.util.List;

public class Repository {
    private String nameStore;
    private int weight = 0;
    public final int CAPACITY;
    private List<Product> arrayStore;

    public Repository(int maxWeigth, String nameStore) {
        CAPACITY = maxWeigth;
        this.nameStore = nameStore;
        this.arrayStore = new ArrayList<Product>();
        System.out.println("store is create  " + nameStore);
    }

    public List<Product> getProducts() {
        return arrayStore;
    }

    public int ProductWeight() {
        return  arrayStore.stream().mapToInt(a -> a.getWeight()).sum();
    }

    public void addProduct(Product p) {
        if((weight + p.getWeight()) <= CAPACITY) {
            weight += p.getWeight();
            arrayStore.add(p);
        }
        else {
            System.out.println("not place");
        }
    }
}
