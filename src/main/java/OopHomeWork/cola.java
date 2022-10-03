package OopHomeWork;

public class cola extends product {
    private double volume;
    public cola(String name, int cost, int id,double volume) {
        super(name, cost, id);
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "cola{" +
                "volume=" + volume +
                '}';
    }
}
