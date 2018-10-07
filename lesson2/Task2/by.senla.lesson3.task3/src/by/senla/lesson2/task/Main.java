package by.senla.lesson2.task;

public class Main {

    public static void main(String[] args) {

        System.out.println("Begin");

        ILineStep Body = new CreateOFBody();
        ILineStep Engine = new CreateOFEngine();
        ILineStep Tower = new CreateOFTower();

        AssemblyTank line = new AssemblyTank((CreateOFBody) Body,(CreateOFEngine) Engine,(CreateOFTower) Tower);
        Tank tank = (Tank) line.assembleProduct(new Tank());
    }
}
