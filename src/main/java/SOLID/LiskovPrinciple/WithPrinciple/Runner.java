package SOLID.LiskovPrinciple.WithPrinciple;

public class Runner {
    public static void main(String[] args) {
        Sparrow sparrow = new Sparrow();
        Penguin penguin = new Penguin();
        sparrow.Eat();
        sparrow.Fly();
        penguin.Eat();
        penguin.Fly();
    }
}
