package SOLID.LiskovPrinciple.WithPrinciple;

public class Penguin implements Bird{
    @Override
    public void Eat() {
        System.out.println("Bird is eating");
    }

    public void Fly() {
        System.out.println("Bird cannot fly");
    }
}
