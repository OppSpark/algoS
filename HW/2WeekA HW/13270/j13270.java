
import java.util.*;
public class j13270 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int ary[][] = new int [10000][2];

        int h = sc.nextInt();
        int a = 1;
        int b = 2;

        for(int i = 1; i <= h; i++)
            ary[i][0] = 100000;

        while(b <= h){
            for(int i = b; i <= h; i++){
                ary[i][0] = Math.min(ary[i][0], ary[i - b][0] + a);
                ary[i][1] = Math.max(ary[i][1], ary[i - b][1] + a);
            }
        b += a;
        a = b - a;
        }
        System.out.println(ary[h][0]+" "+ ary[h][1]);
    }
}
