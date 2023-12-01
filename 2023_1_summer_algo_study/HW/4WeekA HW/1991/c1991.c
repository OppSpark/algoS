#include<stdio.h>
#include<stdlib.h>


void post(char tree);

void in(char tree);

void pre(char tree);

int j = 0;
typedef struct Node{

    char left, right;
}Node;

Node arry[101];

void post(char tree){
    if(tree == ',')
        return;
    else{
        post(arry[tree].left);
        printf("%c", tree);
        post(arry[tree].right);


    }
}

void in(char tree){
    if(tree == '.')
        return;
    else{
        in(arry[tree].left);
        printf("%c",tree);
        in(arry[tree].right);
    }
}

void pre(char tree){
    if(tree == '.')
        return;
    else{
        printf("%c",tree);
        in(arry[tree].left);
        in(arry[tree].right);
    }
}



int main(void){
    int te;

    char d1, d2, d3;

    scanf("%d", &te);

    for(int i = 0; i < te; i++){
        scanf("%c %c %c", &d1, &d2, &d3);
        arry[d1].left = d2;
        arry[d1].right = d3;
    }
    pre('A');
    printf("\n");
    in('A');
    printf("\n");
    post('A');
    printf("\n");

    return 0;
}
    
    
