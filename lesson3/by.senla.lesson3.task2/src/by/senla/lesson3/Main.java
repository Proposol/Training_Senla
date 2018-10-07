package by.senla.lesson3;

        import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();

        int array[] = new int[3];
        int symm = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(899) + 100;
            System.out.print(array[i] + " ");
            symm = symm + array[i] / 100;
        }
        System.out.println("");
        System.out.println(symm);
    }
}
