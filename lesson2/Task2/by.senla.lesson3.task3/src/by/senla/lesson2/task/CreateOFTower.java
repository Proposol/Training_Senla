package by.senla.lesson2.task;

public class CreateOFTower implements ILineStep {


    @Override
    public Tower buildProductPart() {
        System.out.println("Tower is create");
        return new Tower();
    }
}
