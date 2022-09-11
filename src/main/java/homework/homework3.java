package homework;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class homework3 {
    public static void main(String[] args) {
        /*//1
        ArrayList <Integer> ArrNum =fillArray(15);//вводим размер списка
        System.out.println(ArrNum);
        System.out.println(OddSort(ArrNum));
*/
        //2
        ArrayList <Integer> ArrNum2 =fillArray(15);//вводим размер списка
        System.out.println(ArrNum2);
        ArrNum2.sort(Comparator.naturalOrder());
        System.out.println(ArrNum2);
        System.out.println(ArrNum2.get(0));
        System.out.println(ArrNum2.get(ArrNum2.size()-1));
        System.out.println(ArrNum2.get(ArrNum2.size()/2));
        //сначала думал что надо сделать функции xD ,А ПОТОМ ПОНЯЛ ЧТО МОЖНО СДЕЛАТЬ СОРТ И ВСЕ
        System.out.println("Минимальное значение-> "+FindMin(ArrNum2));
        System.out.println("Максимальное значение ->"+FindMax(ArrNum2));
        System.out.println("Среднее значение ->"+FindMid(ArrNum2));

    }
    static ArrayList<Integer> fillArray(int lenght) {
        ArrayList<Integer> ArrNum = new ArrayList<Integer>();
        Random a = new Random();
        for (int i = 0; i < lenght; i++) {
            int random = a.nextInt(100 - 1) + 1;
            ArrNum.add(random);
        }
        return ArrNum;
    }
    static ArrayList<Integer> OddSort(ArrayList<Integer> qwe) {
        for (int i = 0; i < qwe.size(); i++) {
            if (qwe.get(i) % 2 == 0){
                qwe.remove(i);
                i=i-1;
            }
        }
        return qwe;
    }
    static int FindMin(ArrayList<Integer> arr) {
        int min = arr.get(0);
        for (int i = 0; i < arr.size()-1; i++) {
            if (min>arr.get(i+1))min= arr.get(i+1);
        }
        return min;
    }
    static int FindMax(ArrayList<Integer> arr) {
        int max = arr.get(0);
        for (int i = 0; i < arr.size()-1; i++) {
            if (max<arr.get(i+1))max= arr.get(i+1);
        }
        return max;
    }
    static int FindMid(ArrayList<Integer> arr) {
        int mid = arr.get(0);

        return mid;
    }
}
