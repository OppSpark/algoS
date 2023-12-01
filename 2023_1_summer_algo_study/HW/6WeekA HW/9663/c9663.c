#include<stdio.h>

int N, cnt = 0, que[20], check;
int arr(int a) {
    return a>=0?a:-a;
}

void search(int num) {
    if(num == N+1)
        cnt++;
    for(int i=1; i<=N; i++) {
        que[num] = i;
        check = 1;
        for(int j=1; j<num; j++) if(i == que[j] || arr(i-que[j]) == num - j) check = 0;
        if(check) search(num+1);
    }
}

int main() {
    scanf("%d", &N);
    search(1);
    printf("%d", cnt);
}
