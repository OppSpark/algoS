#include <stdio.h> 
#include <stdlib.h>
#include <string.h>

int size[1000000];  //크기 지정
int cnt = 0;  //스텍에 들어 있는 갯수 확인

void push(int num){  //푸쉬
    size[cnt] = num;
    cnt ++;
}

void pop(){  //팝
    if(cnt != 0){
        cnt --;
        printf("%d \n", size[cnt]);
    }
    else
        printf("%d \n", -1);

}

void top(){  // 스텍의 탑 값 출력
    if(cnt != 0)
    printf("%d \n", size[cnt - 1]);
    else
    printf("-1 \n");
}

void Ssize(){ //스텍에 들어 있는 크기 출력
    printf("%d \n", cnt);
}

void empty(){ 
    if(cnt != 0)
        printf("0 \n");
    else
        printf("1 \n");
}

int main(void){
    int line; //입력할 라인 수 성정
    char stack[10];  // 문자열에 쓰이는 배열 생성 

    scanf("%d", &line);  //라인 수 입력

    int number[1000];  //스텍 배열 크기 설정

    for(int i = 0; i < line; i++){  //반복 횟수
        scanf("%s", stack); //문자 입력
        if(strcmp(stack, "1") == 0){  
            int num;;
            scanf("%d", &num);  //스텍에 푸쉬할 때 입력할 값
            push(num);
        }
        else if(strcmp(stack, "2") == 0) 
			pop();
        else if (strcmp(stack, "5") == 0)
            top();
        else if (strcmp(stack, "3") == 0)
            Ssize();
        else if (strcmp(stack, "4") == 0)
        empty();

   
} return 0;
}