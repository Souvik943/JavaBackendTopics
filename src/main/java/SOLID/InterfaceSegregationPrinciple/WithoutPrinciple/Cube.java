package SOLID.InterfaceSegregationPrinciple.WithoutPrinciple;

public class Cube implements CalculateDimensions{
    @Override
    public double calculateArea(double length, double width) {
        return length*width;
    }

    @Override
    public double calculateVolume(double length, double width, double height) {
        return length*width*height;
    }
}
