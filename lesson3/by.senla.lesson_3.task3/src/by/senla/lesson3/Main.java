package by.senla.lesson3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Repository repository = new Repository(130, "Sklad");

        repository.addProduct(new Aplle("Toptushka", 120));
        repository.addProduct(new Milk("Molochnui mir", 80));
        System.out.println(repository.ProductWeight());
    }
}
