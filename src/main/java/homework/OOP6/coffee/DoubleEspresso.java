package homework.OOP6.coffee;

public class DoubleEspresso extends Espresso{

    public DoubleEspresso(int waterVol, int coffeeAmt) {
        super(waterVol, coffeeAmt);

    }

    public DoubleEspresso(int waterVol, int coffeeAmt, boolean sugar) {
        super(waterVol, coffeeAmt, sugar);
    }

    @Override
    public String toString() {
        if (this.sugar)
            return  String.format("\nDouble Espresso with sugar: vol %d ml (coffee: %d g.)",
                    this.waterVol, this.coffeeAmt);
        else
            return String.format("\nDouble Espresso: vol %d ml (coffee: %d g. )",
                    this.waterVol, this.coffeeAmt);

    }
    }

