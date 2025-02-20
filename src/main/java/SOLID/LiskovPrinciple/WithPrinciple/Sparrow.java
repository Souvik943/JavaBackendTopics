package SOLID.LiskovPrinciple.WithPrinciple;

public class Sparrow implements Bird{
    @Override
    public void Eat() {
        System.out.println("Bird is Eating");
    }

    public void Fly() {
        System.out.println("Bird Can Fly");
    }
}
