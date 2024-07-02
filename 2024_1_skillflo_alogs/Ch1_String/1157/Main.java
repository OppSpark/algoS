// https://www.acmicpc.net/problem/1157

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String Str1 = sc.next();

        int maxAnswer = 0;

        int[] answer = new int[26];

        char ch = '?';

        for(int i = 0; i < Str1.length(); i++){
            if ('A' <= Str1.charAt(i) && Str1.charAt(i) <= 'Z')
				answer[Str1.charAt(i) - 'A']++;	
			else 
				answer[Str1.charAt(i) - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (answer[i] > maxAnswer) {
                maxAnswer = answer[i];
                ch = (char) (i + 65);
            }
            else if (answer[i] == maxAnswer) {
                ch = '?';
            }
        }

        System.out.print(ch);
    }
}
