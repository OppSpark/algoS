//https://www.acmicpc.net/problem/10950
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numberCnt = sc.nextInt();

        for(int i = 0; i< numberCnt; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            System.out.println(a+b);
        }
    }
}
