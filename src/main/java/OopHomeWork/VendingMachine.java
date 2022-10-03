package OopHomeWork;

import java.util.HashSet;
import java.util.Set;

public class VendingMachine {
   public cola getcola(String name, int cost, int id,double volume){
       return new cola(name,cost,id,volume);
   }
   public twix gettwix(String name, int cost, int id){
       return new twix(name,cost,id);
   }
   public chips getchips (String name, int cost, int id,String flavour){
       return new chips(name,cost,id,flavour);
   }

    Set<product> products = new HashSet<>();
}
