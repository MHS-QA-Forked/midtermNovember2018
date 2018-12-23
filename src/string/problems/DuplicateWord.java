package string.problems;

import algorithm.Sort;

import java.sql.SQLOutput;

/**
 * Created by mrahman on 04/22/17.
 */
public class DuplicateWord {

    public static void main(String[] args) {
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */

        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";

        String[] words= st.split(" ");
        int wrc=1;
        System.out.println("String length : "+st.length());
        for(int i=0;i<words.length;i++) {
            for (int j = i + 1; j < words.length; j++) {

                if (words[i].equals(words[j])) {
                    wrc = wrc + 1;
                    words[j] = "0";
                }
            }




            if (words[i] != "0")
                System.out.println(words[i] + "--" + wrc);
            wrc = 1;

        }

    }


}
