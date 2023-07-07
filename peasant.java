public class Peasant extends Units {

    public Peasant() {
        super("Peasant", 50, 10, 10, 20, 2, 1);
    }

    private String name;

    public Peasant(String name) {
        this.name = name;
    }

    @Override
    public void step() {
    }

    @Override
    public String getInfo1() {
        return "Peasant " + name;
    }

}
