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

class ResultBreakingtheRecords {

    /*
     * Complete the 'breakingRecords' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY scores as parameter.
     */

    public static List<Integer> breakingRecords(List<Integer> scores) {
        // Write your code here

        int high=scores.get(0);
        int low=scores.get(0);

        int conth=0;
        int contl=0;
        List<Integer> result = new ArrayList<>();

        if (scores.size()<=1000 && scores.size() >= 1
        && scores.stream().allMatch(n->n<=100000000)) {


            for (int i = 0; i < scores.size(); i++) {

                if (scores.get(i) > high) {
                    high = scores.get(i);
                    conth++;

                }
                if (scores.get(i) < low) {
                    low = scores.get(i);
                    contl++;

                }
            }
            result.add(conth);
            result.add(contl);

        }
        return result;
    }

}

 class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
      //  BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> scores = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> result = ResultBreakingtheRecords.breakingRecords(scores);
//
//        bufferedWriter.write(
//                result.stream()
//                        .map(Object::toString)
//                        .collect(joining(" "))
//                        + "\n"
//        );

        bufferedReader.close();
//        bufferedWriter.close();
    }
}
