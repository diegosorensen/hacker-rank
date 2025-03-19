package src.main.java.problemsolving.implementation.strings;



import java.io.*;
        import java.math.*;
        import java.security.*;
        import java.text.*;
        import java.util.*;
        import java.util.concurrent.*;
        import java.util.function.*;
        import java.util.regex.*;
        import java.util.stream.*;
        import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class ResultMarExploration {

    /*
     * Complete the 'marsExploration' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int marsExploration(String s) {
        // Write your code here

        int cont=0;


        for (int i = 0; i < s.length(); i++) {

            switch (i % 3)
            {
                case 0:
                    if (s.charAt(i) !='S') {cont++;}
                break;
                case 1:
                    if (s.charAt(i) !='O') {cont++;}
                    break;
                case 2:
                    if (s.charAt(i) !='S') {cont++;}
                    break;
            }
        }

        return cont;
    }

}

public class SolutionMarExploration {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = bufferedReader.readLine();

        int result = ResultMarExploration.marsExploration(s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

