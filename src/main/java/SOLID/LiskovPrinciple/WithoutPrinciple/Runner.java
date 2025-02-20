package SOLID.LiskovPrinciple.WithoutPrinciple;

public class Runner {
    public static void main(String[] args) {
        Sparrow sparrow = new Sparrow();
        sparrow.eat();
        sparrow.birdName();
        sparrow.fly();

        Penguin penguin = new Penguin();
        penguin.eat();
        penguin.birdName();
        penguin.fly();
    }
}
