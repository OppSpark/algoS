
import java.util.Scanner;
public class j9091 {

	public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        int num = sc.nextInt();
	        int tf = 1;

	        for(int i = 2; i <= num ; i++){
	            if(num % i == 0){
	                tf = 0;

	            }
	            break;
	        }
	        
	        if(tf == 1)
	            System.out.printf( "YES");
	        else
	            System.out.printf( "NO");


	}

}