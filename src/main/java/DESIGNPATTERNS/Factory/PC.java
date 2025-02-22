package DESIGNPATTERNS.Factory;

public class PC extends Computer{

    private String ram;
    private String rom;

    public PC(String ram, String rom) {
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
