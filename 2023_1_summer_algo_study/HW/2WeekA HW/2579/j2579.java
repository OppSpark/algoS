
import java.util.*;
public class j2579 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = 0;  // 계단 수
        num = sc.nextInt();

        int s [] = new int [300];  
        int floor [] = new int [300];

        for(int i = 1; i <= num; i++)  //계단 입력 수 초기값
            floor[i] = sc.nextInt();
        // 계단을 2개 뛰어 넘음 마지막 계단을 밟을 때 2칸인지 1칸인지 ㅗ모르므로 비교하며 오른다.
        s[1] = floor[1];
        s[2] = s[1] + s[2];
        s[3] = Math.max(s[1], s[2]);

        // 끝계단을 비교 하는 것 Math.max로 2개 값을 비교해 끝 개단이 있는지 없는지 확인
        for(int j = 4; j <= num; j++){
            s[j] = Math.max(s[j - 3] + floor[j -1], s[j - 2]) + floor[j];
        }

        System.out.println(s[num]);;


    }
}
