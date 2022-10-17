package homework.OOP6;


import homework.OOP6.builders.AmericanoBuilder;
import homework.OOP6.builders.EspressoBuilder;
import homework.OOP6.builders.LatteBuilder;
import homework.OOP6.builders.MocaccinoBuilder;
import homework.OOP6.coffee.*;

public class main6 {
    public static void main(String[] args) {
        EspressoBuilder eb = new EspressoBuilder();
        LatteBuilder lb = new LatteBuilder();
        AmericanoBuilder ab = new AmericanoBuilder();
        MocaccinoBuilder mb = new MocaccinoBuilder();

        String separator = "\n" + "-".repeat(60);

        System.out.println(separator);

        Espresso cupOfEspresso = eb.buildSweetEspresso();
        System.out.println(cupOfEspresso);

        System.out.println(separator);

        DoubleEspresso cupOfDoubleEspresso = eb.buildDoubleSweetEspresso();
        System.out.println(cupOfDoubleEspresso);

        System.out.println(separator);

        Latte cupOfLatte = lb.buildSweetLatte();
        System.out.println(cupOfLatte);

        System.out.println(separator);

        Americano cupOfAmericano = ab.buildSweetAmericano();
        System.out.println(cupOfAmericano);

        System.out.println(separator);

        Mocaccino cupOfMocaccino = mb.buildMocaccino();
        System.out.println(cupOfMocaccino);

    }


    }
