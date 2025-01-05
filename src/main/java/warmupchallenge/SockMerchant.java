package src.main.java.warmupchallenge;



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

class ResultSockMerchant {

    /*
     * Complete the 'sockMerchant' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY ar
     */

    public static int sockMerchant(int n, List<Integer> ar) {
        // Write your code here

        List<Integer> lista = List.of();
        Map<Integer, Integer> ocurrencias = new HashMap<>();
        ArrayList<Integer> array = new ArrayList<>();

        int contrepetido = 0;

        for (int i = 0; i < ar.size(); i++) {
            int cant =Collections.frequency(ar,ar.get(i));

           if (cant % 2 ==0)
           {
               contrepetido += cant/2;
           }
           else
               contrepetido += cant %2;

            }



        return contrepetido;
    }

}


    public class SockMerchant {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

            int n = Integer.parseInt(bufferedReader.readLine().trim());

            List<Integer> ar = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                    .map(Integer::parseInt)
                    .collect(toList());

            int result = ResultSockMerchant.sockMerchant(n, ar);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();

            bufferedReader.close();
            bufferedWriter.close();
        }
    }
