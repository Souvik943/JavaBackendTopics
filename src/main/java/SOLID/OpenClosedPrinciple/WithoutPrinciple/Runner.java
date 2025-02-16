package SOLID.OpenClosedPrinciple.WithoutPrinciple;

public class Runner {
    public static void main(String[] args) {
        Discount discountCalculator = new Discount();

        System.out.println(discountCalculator.calculateDiscountForPremiumCustomer(20));
        System.out.println(discountCalculator.calculateDiscountForRegularCustomer(20));

    }
}
