import java.util.*;
public class j25343 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int ar = sc.nextInt();

        int arry[][] = new int [ar + 1][ar + 1];
        int arry2[][] = new int [ar + 1 ][ar +1];
        int cnt = 0;

        for(int i = 1; i <= ar; i++){
            for(int j = 1; j <= ar; j++){
                arry[i][j] = sc.nextInt();
            }
        }

        for(int i = 1; i <= ar; i++){
            for(int j = 1; j <= ar; j++){
                int hc = 0;
                for(int k = 1; k <= i; k++){
                    for(int l = 1; l <= j; l++){
                        if(arry[k][l] < arry[i][j] && hc < arry2[k][l])
                            hc = arry2[k][l];
                    }
                }
                arry2[i][j] = hc + 1;
                if(arry2[i][j] > cnt)
                    cnt = arry2[i][j];
                
                }
            }
        System.out.println(cnt);
    }
}