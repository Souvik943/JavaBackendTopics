package SOLID.InterfaceSegregationPrinciple.WithPrinciple;

public class Cube implements CalculateVolume, CalculateArea{
    @Override
    public void calculateArea(int length, int width) {
        System.out.println("area is" + length*width);
    }

    @Override
    public void calculateVolume(int length, int width, int height) {
        System.out.println("volume is" + length*width*height);
    }
}
