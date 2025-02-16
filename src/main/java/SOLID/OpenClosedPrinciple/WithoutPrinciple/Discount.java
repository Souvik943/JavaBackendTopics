package SOLID.OpenClosedPrinciple.WithoutPrinciple;

public class Discount {

    public double calculateDiscountForRegularCustomer(double amount) {
        return amount*0.2;
    }

    public double calculateDiscountForPremiumCustomer(double amount) {
        return amount*0.5;
    }
}
