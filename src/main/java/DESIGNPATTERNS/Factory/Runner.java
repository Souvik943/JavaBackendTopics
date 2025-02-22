package DESIGNPATTERNS.Factory;

public class Runner {
    public static void main(String[] args) {
        Computer pc = Factory.getComputerDetails("PC","32","512");
        Computer server = Factory.getComputerDetails("Server","64","1012");
    }
}
