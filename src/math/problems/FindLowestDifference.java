package math.problems;

import java.lang.reflect.Array;
import java.util.Arrays;

public class FindLowestDifference {
    public static void main(String[] args) {
        /*
         Implement in java.
         Read this below two array. Find the lowest difference between the two array cell.
         The lowest difference between cells is 1
        */
        int[] array1 = {30, 12, 5, 9, 2, 20, 33, 1};
        int[] array2 = {18, 25, 41, 47, 17, 36, 14, 19};

        int m = array1.length;
        int n = array2.length;
        System.out.println(findlowestestDifference
                (array1, array2, m, n));


    }


    static int findlowestestDifference(int array1[], int array2[],
                                       int m, int n) {

        Arrays.sort(array1);
        Arrays.sort(array2);

        int a = 0, b = 0;


        int result = Integer.MAX_VALUE;


        while (a < m && b < n) {
            if (Math.abs(array1[a] - array2[b]) < result)
                result = Math.abs(array1[a] - array2[b]);


            if (array1[a] < array2[b])
                a++;

            else
                b++;
        }

        return result;

    }

}