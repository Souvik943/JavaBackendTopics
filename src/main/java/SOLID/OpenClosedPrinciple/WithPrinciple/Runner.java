package SOLID.OpenClosedPrinciple.WithPrinciple;

public class Runner {
    public static void main(String[] args) {
        PremiumDiscountImpl premiumDiscount = new PremiumDiscountImpl();
        System.out.println(premiumDiscount.calculateDiscount(20));

        RegularDiscountImpl regularDiscount = new RegularDiscountImpl();
        System.out.println(regularDiscount.calculateDiscount(20));
    }
}
