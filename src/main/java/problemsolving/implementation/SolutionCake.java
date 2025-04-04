package problemsolving.implementation;

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

class Result {

    /*
     * Complete the 'birthdayCakeCandles' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY candles as parameter.
     */


    public static int birthdayCakeCandles(List<Integer> candles) {
        // Write your code here
        int maxactual = 0;
        int contmax = 0;
        int contfinal= 0;


        for (int i = 0; i < candles.size(); i++) {
            if (candles.get(i) > maxactual)
            { maxactual = candles.get(i);

               contmax++;
            }

        }
        for (int c = 0; c < candles.size(); c++) {
            if (candles.get(c)== maxactual)
                contfinal++;
        }

        return contfinal;

    }
}

    public class SolutionCake {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

            int candlesCount = Integer.parseInt(bufferedReader.readLine().trim());

            List<Integer> candles = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                    .map(Integer::parseInt)
                    .collect(toList());




              int result = Result.birthdayCakeCandles(candles);

              bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();

            bufferedReader.close();
            bufferedWriter.close();

            System.out.println("hola");
        }

    }
