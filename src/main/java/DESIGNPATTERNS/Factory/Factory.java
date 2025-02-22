package DESIGNPATTERNS.Factory;

public class Factory {
    public static Computer getComputerDetails(String computerType, String RAM, String ROM) {
        if(computerType.equals("PC")) {
            return new PC(RAM,ROM);
        }
        else {
            return new Server(RAM,ROM);
        }
    }
}
