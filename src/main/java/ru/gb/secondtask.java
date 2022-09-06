package ru.gb;

public class secondtask {
    public static void main(String[] args) {
    /*

        int [] arr = new int [] { 1,1,0, 1, 1, 1};
        int max = 0;
        int current_max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1){
                current_max = current_max + 1;
                    if (current_max > max) max = current_max;
                    else
            }
            System.out.println(max);
            */

        String str = "asd asdwq qwer qq";
        String[] words = str.split(" ");
        for (int i = words.length; i >= 1; i--) {
            int count = 0;
            String temp = words[count];
            words[count] = words[i];
            words[i] = temp;
            System.out.println(words);
        }
        }

    }


