package problemsolving.implementation;


import java.util.Arrays;
import java.util.Arrays;

public class ExamenGrow {


    public static void main(String[] args)
    {
        String original = "this is a test";


        reserve(original);

        System.out.println("word = " + original);

    }

    public static String reserve  (String word)
    {

        String sentence[] = word.split(" ");
        String sentence2[];
        String sentence3;

        for (int i = 0; i < sentence.length ; i++) {
           // System.out.println("word = " + sentence[i]);

            for (int j = sentence[i].length(); j > 0 ; j--) {

                System.out.println("word = " + sentence[i].substring(j-1,j));

                sentence[i].substring(j-1,j).toCharArray();


            }

        }

        return "1;";
    }

}
