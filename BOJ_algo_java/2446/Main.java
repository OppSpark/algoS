//https://www.acmicpc.net/problem/2446
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int number = sc.nextInt();
        int col = 0;
        for(int i = 0; i < number-1; i++){
			for(int j=0; j<i; j++)
				System.out.print(" ");
			for(int j=i*2; j<(number*2)-1; j++)
				System.out.print("*");
			System.out.println();
        }

        for(int i = number-1; i < (number * 2) - 1; i++) {
			for(int j = col; j < number - 1; j++)
				System.out.print(" ");
			for(int j = 0; j < (col * 2) + 1; j++)
				System.out.print("*");
			System.out.println();
			col ++;
		}
    }
}
