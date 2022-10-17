package homework.OOP6.builders;

import homework.OOP6.coffee.Americano;

public class AmericanoBuilder extends EspressoBuilder{
    void addWater(Americano cupOfAmericano) {
        System.out.println("Heating water...");
        cupOfAmericano.setWater(170);
        System.out.println("Water added.");
    }


    public Americano buildLatte() {
        Americano cupOfAmericano = new Americano(buildEspresso());
        addWater(cupOfAmericano);
        return cupOfAmericano;
    }

    public Americano buildSweetAmericano() {
        Americano cupOfAmericano = new Americano(buildEspresso(), true);
        addWater(cupOfAmericano);
        return cupOfAmericano;
    }
}
