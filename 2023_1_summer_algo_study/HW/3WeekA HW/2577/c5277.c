#include<stdio.h>
int main(void){
    int a, b ,c;
    int sum;
    int arry[10] = {0, };

    int n;

    scanf("%d %d %d",&a, &b, &c);
    sum = a * b * c;

    while(sum > 0){
        n = sum % 10;

        arry[n]++;

        sum /= 10;
    }

    for(int i = 0; i <= 9; i++){
        printf("%d \n", arry[i]);
    }
    return 0;
}