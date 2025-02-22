package DESIGNPATTERNS.Factory;

public class Server extends Computer{

    private String ram;
    private String rom;

    public Server(String ram, String rom) {
        this.ram = ram;
        this.rom = rom;
    }

    @Override
    public String getRam() {
        return this.ram;
    }

    @Override
    public String getRom() {
        return this.rom;
    }
}
