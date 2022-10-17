package homework.OOP6.builders;

import homework.OOP6.coffee.DoubleEspresso;
import homework.OOP6.coffee.Espresso;

public class EspressoBuilder {

        public EspressoBuilder() {
        }

        void boilWater() {
            System.out.println("Boiling water...");
            System.out.println("Ready.");
        }

        public Espresso buildEspresso() {
            boilWater();
            return new Espresso(30, 10);
        }

        public Espresso buildSweetEspresso() {
            boilWater();
            return new Espresso(30, 10, true);
        }

        public DoubleEspresso buildDoubleEspresso() {
            boilWater();
            return new DoubleEspresso(60, 20);
        }

        public DoubleEspresso buildDoubleSweetEspresso() {
            boilWater();
            return new DoubleEspresso(60, 20, true);
        }
}
