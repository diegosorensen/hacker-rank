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

        for (int i = 0; i < arr.size() ; i++) {

            if (arr.get(i)==1)
            {cont1++; list.add(i,cont1+1);
            }
            if (arr.get(i)==2)
            {cont2++;list.add(i,+cont2+1);}
            if (arr.get(i)==3)
            {cont3++;list.add(i,cont3+1); }
            if (arr.get(i)==4)
            {cont4++;list.add(i,cont4+1); }
            if (arr.get(i)==5)
            {cont5++; list.add(i,cont5+1);}

        }
        int max =0;
        for (int i = 0; i < list.size(); i++) {

            if (max < list.get(i))
            { max =list.get(i);}
        }



        return 0;
    }

}

 class SolutionMigratoryBirds {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
       /// BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = ResultMigratoryBirds.migratoryBirds(arr);

       // bufferedWriter.write(String.valueOf(result));
      //  bufferedWriter.newLine();

        bufferedReader.close();
       // bufferedWriter.close();
    }
}
