// https://www.acmicpc.net/problem/10810
import java.util.Scanner;
public class BOJ_10810 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        int m = sc.nextInt();

        for(int i = 0; i < m; i++){
            int j = sc.nextInt();
            int k = sc.nextInt();
            int l = sc.nextInt();

            for(int j2 = j - 1; j2 < k; j2++){
                arr[j2] = l;
            }
        }
        for(int k2 = 0 ; k2 < arr.length; k2++){
            System.out.print(arr[k2] + " ");
        }

    }
}