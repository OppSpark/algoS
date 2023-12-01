#include<stdio.h>
int main(void){
    
    int arry[11];
    int cnt;
    int number;

    scanf("%d",&cnt);

    arry[0] = 1;
    arry[1] = 2;
    arry[2] = 4;

    for(int i = 1;  i <= cnt; i++){
        scanf("%d", &number);

        for(int j = 3; j < number; j++){
            arry[j] = arry[j - 1] + arry[j - 2] + arry[j - 3];
        }
        
        printf("%d \n",arry[number - 1]);

    }

    return 0;
}