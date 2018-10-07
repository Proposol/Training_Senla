package by.senla.lesson2.task;

public class AssemblyTank implements IAssemblyLine {

    private ILineStep Body;
    private ILineStep Tower;
    private ILineStep Engine;

    public AssemblyTank(CreateOFBody Body, CreateOFEngine Engine, CreateOFTower Tower){
        this.Body = Body;
        this.Engine = Engine;
        this.Tower = Tower;
    }

    public IProduct assembleProduct(IProduct iProduct) {
        iProduct.installFirstPart(Body.buildProductPart());
        iProduct.installSecondPart(Engine.buildProductPart());
        iProduct.installThirdPart(Tower.buildProductPart());
        System.out.println("Tank is assembled");
        return iProduct;
    }
}
