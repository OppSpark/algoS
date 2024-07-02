// https://www.acmicpc.net/problem/1919

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        
    Scanner sc = new Scanner(System.in);

    String a = sc.next();
    String b = sc.next();

    int[] cntA = new int[26];
    int[] cntB = new int[26];

    for(int i = 0; i < a.length(); i++)
        cntA[a.charAt(i) - 'a']++;
    
    for(int i = 0; i < b.length(); i++)
        cntB[b.charAt(i) - 'a']++;

        int answer = 0;

        for(int i = 0; i < 26; i ++){
            if(cntA[i] > cntB[i])
                answer += cntA[i] - cntB[i];
            else
                answer += cntB[i] - cntA[i];
        }
        System.out.println(answer);
    }
}
