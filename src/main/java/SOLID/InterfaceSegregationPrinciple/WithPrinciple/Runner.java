package SOLID.InterfaceSegregationPrinciple.WithPrinciple;

public class Runner {
    public static void main(String[] args) {
        Square square = new Square();
        Cube cube = new Cube();
        square.calculateArea(1,2);
        cube.calculateArea(1,2);
        cube.calculateVolume(1,2,3);
    }
}
