package SOLID.InterfaceSegregationPrinciple.WithoutPrinciple;

public class Runner {
    public static void main(String[] args) {
        Square square = new Square();
        Cube cube = new Cube();
        System.out.println(square.calculateArea(2,2));
        System.out.println(square.calculateVolume(2,2,2));
        System.out.println(cube.calculateArea(2,2));
        System.out.println(cube.calculateVolume(2,2,2));
    }
}
