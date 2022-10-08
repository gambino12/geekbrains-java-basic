package homework.OOP3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class hw3 {
    public static void main(String[] args) {
        human human1 =  new human(1,"Олег","M",5);
        human human2 =  new human(2,"Андрей","M",26);
        human human3 =  new human(3,"Анжелика","W",24);
ArrayList<human> as = new ArrayList<>();
        as.add(human1);
        as.add(human2);
        as.add(human3);

        Relative r1 = new Relative(human1,human2,Relation.Child);
        Relative r2 = new Relative(human2,human1,Relation.Parents);
        Relative r3 = new Relative(human1,human3,Relation.Child);
        Relative r4 = new Relative(human3,human2,Relation.Wife);
        Relative r5 = new Relative(human3,human1,Relation.Parents);
        Relative r6 = new Relative(human2,human3,Relation.Husband);
        ArrayList<Relative> ad = new ArrayList<>();
        ad.add(r1);
        ad.add(r2);
        ad.add(r3);
        ad.add(r4);
        ad.add(r5);
        ad.add(r6);
        controller a = new controller();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите имя что бы увидеть все связи->");
        String name = sc.nextLine();
        a.findByName(name,ad);

    }
}
