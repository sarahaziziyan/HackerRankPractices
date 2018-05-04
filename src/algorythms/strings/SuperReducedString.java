import java.util.*;

public class SuperReducedString{

    static String super_reduced_string(String s){
        char[] letters = s.toCharArray();
        char r = 'l';
        for(char letter:letters){
            if(letter==r){
                
            }
            System.out.println(letter+"\n");
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = super_reduced_string(s);
        System.out.println(result);
    }
}
