package src.main.java.problemsolving.implementation;

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

class ResultDivisibleSumPairs {

    /*
     * Complete the 'divisibleSumPairs' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER k
     *  3. INTEGER_ARRAY ar
     */

    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
        // Write your code here

        int cont=0;

        if (n >=2 && n <=100 && 1 <=k && k <= 100
        && ar.stream().allMatch(x->x <=100)
        ) {
            for (int i = 0; i < ar.size(); i++) {

                for (int j = i; j < ar.size() - 1; j++) {
                    int aux = (ar.get(i) + ar.get(j + 1));
                    if (aux % k == 0) {
                        cont++;
                    }
                }

            }
        }
        return cont;
    }

}

 class SolutionDivisibleSumPairs {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int k = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> ar = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = ResultDivisibleSumPairs.divisibleSumPairs(n, k, ar);

       // bufferedWriter.write(String.valueOf(result));
      //  bufferedWriter.newLine();

        bufferedReader.close();
       // bufferedWriter.close();
    }
}
