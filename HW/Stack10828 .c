#include <stdio.h> 
#include <stdlib.h>
#include <string.h>

int size[100000];
int cnt = 0;

void push(int num){
    size[cnt] = num;
    cnt ++;
}

void pop(){
    if(cnt != 0){
        cnt --;
        printf("%d \n", size[cnt]);
    }
    else
        printf("%d \n", -1);

}

void top(){
    if(cnt != 0)
    printf("%d \n", size[cnt - 1]);
    else
    printf("%d \n", -1);
}

void Ssize(){
    printf("%d \n", cnt);
}

void empty(){
    if(cnt != 0)
        printf("0 \n");
    else
        printf("1 \n");
}

int main(void){
    int line;
    char stack[10];

    scanf("%d", &line);

    int number[1000];

    for(int i = 0; i < line; i++){
        scanf("%s", stack);
        if(strcmp(stack, "push") == 0){
            int num;;
            scanf("%d", &num);
            push(num);
        }
        else if(strcmp(stack, "pop") == 0) 
			pop();
        else if (strcmp(stack, "top") == 0)
            top();
        else if (strcmp(stack, "size") == 0)
            Ssize();
        else if (strcmp(stack, "empty") == 0)
        empty();

   
} return 0;
}