package problemSolving;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class BirthdayCake {

    // Complete the birthdayCakeCandles function below.
    static int birthdayCakeCandles(int[] ar) {
        int numberOfPossibleCandles = 0;
        int max = 0;
        for (int candle : ar) {
            if(max<candle){
                max = candle;                
            }
        }
        for (int candle : ar) {
            if(candle==max)
                numberOfPossibleCandles++;
        }
        return numberOfPossibleCandles;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int arCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[arCount];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < arCount; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = birthdayCakeCandles(ar);

        System.out.println(String.valueOf(result));


        scanner.close();
    }
}
