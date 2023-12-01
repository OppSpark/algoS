#include<stdio.h>
#define num 1000000


int main(void){
int s ,sum = 0, floor[101][10] = {0,};

scanf("%d", &s);

for (int i = 0; i < 10; i++)
    floor[1][i] = 1;
for(int i = 2; i <= s; i++){
    for(int j = 0; j < 10; j++){
        if( j == 0)
            floor[i][0] = floor[i - 1][1] %num;
        else if (j == 9)
            floor[i][9] = floor[i - 1][8] %num;
        else 
            floor[i][j] = (floor[i - 1][j - 1] + floor[i - 1][j + 1]% num);
        
    }
}
for(int i = 1; i < 10; i ++)
    sum = (sum + floor[s][i] % num);

printf("%d",sum % num);

}