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

class ResulttimeConversion {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
        // Write your code here
        String  finalstring = s;
        String shour;
        int hour =Integer.parseInt(s.split(":",2)[0]) ;



        if (s.charAt(8) == 'P')
        {
            if (hour == 12)
                {   shour = "12";
                    finalstring = finalstring.replace(s.split(":", 2)[0], shour);
                    finalstring = finalstring.split("PM")[0].toString();
                    return finalstring;

                }

                hour = hour + 12;
                shour = String.valueOf(hour);
                finalstring = finalstring.split("PM")[0].toString();
                finalstring = finalstring.replace(s.split(":", 2)[0], shour);

        }
        else
            if (hour == 12)
            {

                shour = "00";
                finalstring = finalstring.split("AM")[0].toString();
                finalstring = finalstring.replace(s.split(":",2)[0],shour);
            }
        finalstring = finalstring.split("AM")[0].toString();

        return finalstring;

    }
}
public class TimeConversionSolution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));


        String s = bufferedReader.readLine();

        String result = ResulttimeConversion.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
