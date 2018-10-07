package by.senla.lesson2.task;

public class CreateOFEngine implements ILineStep {

    @Override
    public Engine buildProductPart() {
        System.out.println("Engine is create");
        return new Engine();
    }
}
