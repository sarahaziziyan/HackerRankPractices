package challenges;

//import java.io.*;
import java.util.Scanner;

public class CountingValleys {

    static int countingValleys(int n, String s) {
        int valleys = 0;
        if(n%2 == 0){
            char[] moves = s.toCharArray();
            int height = 0;
            boolean hasValley = false;            
            for(char ch : moves){
                switch (ch) {
                    case 'D':
                        height -= 1;
                        break;
                    case 'U':
                        height +=1;
                        break;
                    default:
                        break;
                }
                if(height<0){
                    hasValley = true;
                }
                if(height == 0 && hasValley){
                    valleys +=1;
                    hasValley = false;
                }
            }
            
        }else{
            return 0;
        }
        return valleys;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        int result = countingValleys(n, s);
        System.out.println(result);
        in.close();
    }
}