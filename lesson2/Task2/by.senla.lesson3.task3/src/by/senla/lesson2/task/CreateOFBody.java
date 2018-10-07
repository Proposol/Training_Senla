package by.senla.lesson2.task;

public class CreateOFBody implements  ILineStep {
        @Override
        public Body buildProductPart(){
            System.out.println("Body is create");
            return new Body();
        }
}
