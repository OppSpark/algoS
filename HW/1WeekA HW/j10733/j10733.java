package HW.j10733;
import java.util.Scanner;
import java.util.Stack;  //스텍 유틸
public class j10733 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Stack<Integer> stack = new Stack<>();  // 스택 선언문

    int ww = sc.nextInt(); //반복 횟수

    int pushnum = 0;
    int sum = 0;

    for(int i = 1; i <= ww ; i++) {  //스텍 반복 횟수

    pushnum = sc.nextInt();  // 스텍에 넣을 값 입력문

    if(pushnum == 0)  // 입력 받은 값이 0 이면 면 팝
        stack.pop();
    else
        stack.push(pushnum); //입력 받은 값이 0이 아니기에 스텍에 푸쉬
    }
    
    while(stack.isEmpty() != true){  // 스텍이 Empty일때 까지 반복
        sum += stack.peek(); //스텍 TOS값을 불러와 sum에 더한다
        stack.pop();  //스텟 TOS값 제거
    }

    System.out.println(sum); //출력

}
}