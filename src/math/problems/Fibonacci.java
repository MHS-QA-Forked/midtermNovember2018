package math.problems;

import java.util.Arrays;

public class Fibonacci {
    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
         */
        int [] number = new int[40];
        for (int i = 0; i <40; i++) {
            if(i<2) {
                number[i] = i;
            }else{
                number[i] = number [i-2]+ number[i-1];
            }
        }
        System.out.println(Arrays.toString(number));
        }



}
