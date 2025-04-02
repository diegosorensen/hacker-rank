package src.main.java.problemsolving.implementation.strings;



import java.io.*;

        import java.util.*;


class ResultPangrams {

    /*
     * Complete the 'pangrams' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String pangrams(String s) {
        // Write your code here

        //  Collections.frequency(s,"a");

        Set<Character> chars = new HashSet<>();


        for (int i = 0; i < s.length(); i++) {

            if (s.toLowerCase().charAt(i) >= 97 && s.toLowerCase().charAt(i) <= 122) {

                chars.add(s.toLowerCase().charAt(i));
            }

        }

        if (chars.size() ==26)
        {return "pangram";}
        else return "not pangram";
    }
}

public class SolutionPangrams {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = bufferedReader.readLine();

        String result = ResultPangrams.pangrams(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
