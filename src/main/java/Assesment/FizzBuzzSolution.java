package src.main.java.Assesment;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


class FizzBuzz {

    /*
     * Complete the 'fizzBuzz' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void fizzBuzz(int n) {
        // Write your code here

        if (n <= 200000) {
            for (int i = 1; i <= n; i++) {

                if (i % 5 == 0 && i % 3 == 0) {
                    System.out.println("FizzBuzz");
                } else if (i % 3 == 0 && i % 5 != 0) {
                    System.out.println("Fizz");
                } else if (i % 5 == 0 && i % 3 != 0) {
                    System.out.println("Buzz");
                } else if (i % 5 != 0 && i % 3 != 0) {
                    System.out.println(i);
                }

            }
        }
    }

}
public class FizzBuzzSolution {
    public static void main(String[] args) throws IOException {
       // BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine().trim());

        FizzBuzz.fizzBuzz(n);

        bufferedReader.close();
    }
}



