package SOLID.SingleResponsibilityPrinciple;

public class StringModifier {
    private String str;
    private String strToBeModifiedTo;

    public String concatString(String str, String strToBeModifiedTo) {
        return str.concat(strToBeModifiedTo);
    }

    public String printString(String str) {
        return str;
    }

    public Boolean validateString(String str) {
        return str.length() > 10;
    }
}

// In this class we can see that we are performing different things such as
// concatenating a string + printing a string as well validating a string
// This violates this theorem