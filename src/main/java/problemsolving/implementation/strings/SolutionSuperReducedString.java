package src.main.java.problemsolving.implementation.strings;

import java.io.OutputStreamWriter;
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

class ResultSuperReducedString {

    /*
     * Complete the 'superReducedString' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String superReducedString(String s) {
        // Write your code here
        StringBuilder sb = new StringBuilder(s);
        while (true) {
            boolean reduced = false;
            for (int i = 0; i < sb.length() - 1; i++) {
                if (sb.charAt(i) == sb.charAt(i + 1)) {
                    sb.delete(i, i + 2);
                    reduced = true;
                    break;
                }
            }
            if (!reduced) {
                break;
            }
        }
        return sb.length() == 0 ? "Empty String" : sb.toString();

    }


//        StringBuilder sb = new StringBuilder(s);
//        if (s.length() <= 100) {
//            for (int i = 0; i < sb.length(); i++) {
//
//                if (sb.charAt(i) == sb.charAt(i + 1)
//                    //&& i
//                ) {
//                    sb.delete(i, i + 2);
//                }
//            }
//            if (sb.isEmpty()) {
//                return "Empty String";
//            }
//        }
//  return sb.toString();
//    }

}

public class SolutionSuperReducedString {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = bufferedReader.readLine();

        String result = ResultSuperReducedString.superReducedString(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
