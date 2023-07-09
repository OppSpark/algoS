import java.util.*;

public class j11659 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        int arry [] = new int [1000000];

        int py = sc.nextInt();
        int line = sc.nextInt();

        int n1, n2;


        for(int i = 1 ; i < py; i++){
            arry[i] = sc.nextInt();
            arry[i] += arry[i - 1];
        }

        for(int j = 0; j < line; j++){
            n1 = sc.nextInt();
            n2 = sc.nextInt();
            
            System.out.println(arry[n2] - arry[n1 - 1]);
            
        }



    }

    
}
