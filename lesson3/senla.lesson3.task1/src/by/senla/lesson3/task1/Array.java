package by.senla.lesson3.task1;

public class Array {
    public  static void getAnswer (){
    String[] array = {"Dog", "Cat", "carpet", "zoohjj", "city", "Case", "cinea", "Zoo", "apple"};

    int arrayLenght = array[0].length();
        for (int j = 1; j < array.length; j++) {
        if (arrayLenght < array[j].length()) {
            arrayLenght = array[j].length();
        }
    }
        System.out.println();
        System.out.println("Max Length of elements "+arrayLenght);

        for (int i = 0; i < array.length; i++) {
        if (array[i].length() == arrayLenght) {
            System.out.print("Your max elements in array "+array[i] + " ");
        }

    }}
}
