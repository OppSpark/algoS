#include<stdio.h>
int main(void){
    
    int arry[11] = {0};

    arry[1] = 1;
    arry[2] = 2;
    arry[3] = 4;

    int cnt;
    int number;

    scanf("%d",&cnt);

    for(int i = 1;  i <= cnt; i++){
        scanf("%d", &number);

        arry[0] = 1;
        arry[1] = 2;
        arry[2] = 3;
        arry[3] = 4;

        for(int j = 4; j < number + 1; j++){
            arry[i] = arry[i - 1] + arry[i - 2] + arry[i - 3];
        }
        
        printf("%d \n",arry[number]);

    }

    return 0;
}