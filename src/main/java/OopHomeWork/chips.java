package OopHomeWork;

public class chips extends product{
    private String flavour;
    public chips(String name, int cost, int id,String flavour) {
        super(name, cost, id);
        this.flavour = flavour;
    }

    @Override
    public String toString() {
        return "чипсы{" +
                "вкус='" + flavour + '\'' +
                '}';
    }
}
