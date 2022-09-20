package homework;

import java.util.*;

public class homework51 {
        public static void main(String[] args) {
            LinkedList<String>name=new LinkedList<>();
            Map<String,Integer>countNames=new TreeMap<>();
            Map<String,String>ad = Map.of(  "Петрова","Василиса",
                    "Чернышов","Швапс",
                    "Белова","Василиса",
                    "Лыков","Штэпс",
                    "Папич","Штэлс",
                    "Кююгер","Штэпс",
                    "Крюгер","Штэпс");
            for (Map.Entry<String, String> entry : ad.entrySet()) {
                name.add(entry.getValue());
            }
                System.out.println(name);
            for (String Names : name) {
                if (!countNames.containsKey(Names)) {
                    int count = Collections.frequency(name, Names);
                    countNames.put(Names, count);
                }
            }
            System.out.println(countNames);


        }
}