package SOLID.OpenClosedPrinciple.WithPrinciple;

public class RegularDiscountImpl implements Discount {

    @Override
    public double calculateDiscount(double amount) {
        return amount*0.5;
    }
}
