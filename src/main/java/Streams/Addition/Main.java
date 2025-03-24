package Streams.Addition;

public class Main {
    public static void main(String[] args) {
        AdditionInterface additionInterface;
        additionInterface = (a, b) -> {
            return a+b;
        };

        System.out.println(additionInterface.add(2,3));
    }
}
