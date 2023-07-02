#include<stdio.h>

int main(void){
    int n1, n2, n3;
    int arry[1000000];
    scanf("%d %d", &n1, &n2);

    arry[1] = 1;
    
    for(int i = 2; i <= n2; i++){  //핵심 알고리즘  
        for(int j = 2; i * j <= n2; j ++)
            arry[i*j] = 1;
    }


    for(int i = n1; i <= n2; i++){   //출력
        if(arry[i] == 0)
            printf("%d\n",i);
    }
    return 0;
}