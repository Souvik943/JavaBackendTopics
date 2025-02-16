package SOLID.OpenClosedPrinciple.WithPrinciple;

public class PremiumDiscountImpl implements Discount {

    @Override
    public double calculateDiscount(double amount) {
        return amount*0.3;
    }
}
