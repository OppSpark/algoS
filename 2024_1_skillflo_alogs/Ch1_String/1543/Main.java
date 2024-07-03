//https://www.acmicpc.net/problem/1543
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String word = sc.nextLine();

        int cnt = 0;
        int start = 0;

        for(;;) {
            int findIndex = input.indexOf(word, start);
            if (findIndex < 0)
                break;
            cnt++;
            start = findIndex + word.length();
        }
        System.out.println(cnt);
    }
}
