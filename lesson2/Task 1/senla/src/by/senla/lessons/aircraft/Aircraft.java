package by.senla.lessons.aircraft;

public class Aircraft extends Flight {
    private int number = 4;
    private String name;

    public Aircraft() {
        System.out.println("Aircraft");
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void shipping() {
        System.out.println("Shipping is ready.");
        System.out.println(number);
    }
}
