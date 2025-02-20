package SOLID.InterfaceSegregationPrinciple.WithPrinciple;

public class Square implements CalculateArea{
    @Override
    public void calculateArea(int length, int width) {
        System.out.println("area is" + length*width);
    }
}
