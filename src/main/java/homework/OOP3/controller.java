package homework.OOP3;

import java.util.ArrayList;

public class controller {
 public void findByName(String name,ArrayList<Relative>R){
  for (Relative r:R) {
   if(r.getH1().getName().equalsIgnoreCase(name)){
    System.out.println(r.toString());
   }

  }


 }

}
