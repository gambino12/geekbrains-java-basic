/*
package homework;
import java.io.*;

public class homework1 {
    public static void main(String[] args) {

        //Напишите функцию, для поиска наиболее длинного общего префикса, среди массива строк.
        //Если общего префикса нет, то возвращать пустую строку.
        String[] arr = {"floar", "we" , "fl"};
        int PrefixLen = arr[0].length();
        for (int i = 0; i < arr.length; i++) {
            boolean check = arr[i].regionMatches(0, arr[0], 0, PrefixLen);
            if (check == false){
                PrefixLen-=1;
                i-=1;
            }
        }
        char [] wordfirst = arr[0].toCharArray();
        for (int i = 0; i < PrefixLen; i++) {
            System.out.println((wordfirst[i]));

        }





        //1
        int[] arr = new int [] {2,7,4,6,5,3,5,6,5};
        int sum1 = 0;
        for (int i = 0; i < arr.length/2; i++) {
            sum1 += arr[i];
            int sum2 = 0;
            for (int j = arr.length-1; j >= 0 ; j--) {
                sum2 += arr[j];
                if ( sum1 == sum2){
                    System.out.println(i + 1);
                    break;
                }
            }
        }




    }
}

*/