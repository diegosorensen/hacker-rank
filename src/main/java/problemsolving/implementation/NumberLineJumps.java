package problemsolving.implementation;

   import java.io.*;
   import java.util.Arrays;

   import static java.util.stream.Collectors.joining;

class NumberLineJumpsResult {

    /*
     * Complete the 'kangaroo' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER x1
     *  2. INTEGER v1
     *  3. INTEGER x2
     *  4. INTEGER v2
     */

    public static String kangaroo(int x1, int v1, int x2, int v2) {
        // Write your code here

        String resp;
        if (0 <= x1 && x1 < x2 && x1 <=10000 && x2 <= 10000
        &&v1 <= 10000 && v1 >= 1 && v2 <=10000 &&v2 >=1 )

        {
            while (x1 !=x2 && x1 <= Integer.MAX_VALUE
            && x2 <=Integer.MAX_VALUE)
            {
                x1 = x1+v1;
                x2 = x2+v2;
            }
        }

        if (x1 ==x2)
        {resp="YES";}
        else
        {resp="NO";}

        return resp;

    }

}

 class NumberLineJumpsSolution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
       // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int x1 = Integer.parseInt(firstMultipleInput[0]);

        int v1 = Integer.parseInt(firstMultipleInput[1]);

        int x2 = Integer.parseInt(firstMultipleInput[2]);

        int v2 = Integer.parseInt(firstMultipleInput[3]);

        String result = NumberLineJumpsResult.kangaroo(x1, v1, x2, v2);

      //  bufferedWriter.write(result);
      //  bufferedWriter.newLine();

        bufferedReader.close();
       // bufferedWriter.close();
        System.out.println("args = " );
    }
}

