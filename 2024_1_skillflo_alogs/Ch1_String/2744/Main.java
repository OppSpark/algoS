import java.util.*;
public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();

        for(int i = 0; i < str1.length(); i++){
            char ch = str1.charAt(i);

            if('A' <= ch && ch <= 'Z')
                System.out.print((char)('a' + ch - 'A'));
            else
                System.out.print((char)('A' + ch - 'a'));
        }
    
    }
}