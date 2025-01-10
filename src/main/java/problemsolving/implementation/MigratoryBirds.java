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

class ResultMigratoryBirds {

    /*
     * Complete the 'migratoryBirds' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static int migratoryBirds(List<Integer> arr) {
        // Write your code here

        int cont1=0,cont2=0,cont3=0,cont4=0,cont5=0;

        List<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> arrayList= new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            arrayList.add(i,0);

        }

        int bird =1;
        for(int j=2;j<=5;j++) {
            if (Collections.frequency(arr, j) > Collections.frequency(arr, bird)) {
                bird = j;
            }
        }

        return bird;
    }

}

 class SolutionMigratoryBirds {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = ResultMigratoryBirds.migratoryBirds(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
         bufferedWriter.close();
    }
}
