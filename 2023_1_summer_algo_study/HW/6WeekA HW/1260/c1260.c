#include <stdio.h>
#define MAX 1001

int mx[MAX][MAX];
int vi[MAX * MAX]; //방문 표시하는거

void DFS (int v, int N) {

	printf("%d ", v);
	
	
	vi[v] = 1;// 방문 표시
	

	for (int d = 1; d <= N; d++) {
		if (!vi[d] && mx[v][d]) {  //이 
			DFS(d, N);
		}
	}
}



void BFS (int v, int N) {
	
	int front = -1, r = -1;
	int queue[MAX * MAX] = { 0 };
	
	r++;
	queue[r] = v;
	
	// 방문 표시
	vi[v] = 1;
	

	printf("%d ", v);
	
	
	while (front < r) {  //bfs 코드
		
		front++;  //프론트에 1 더하고 출력
		int nextV = queue[front];
		
		
		for (int d = 1; d <= N; d++) {  //인접리스트 획인

			if (!vi[d] && mx[nextV][d]) {
				r++;
				vi[d] = 1;
				queue[r] = d;
				
				printf("%d ", d);
			}
		}
	}
}

void init (int N) {
	printf("\n");
	for (int i = 1; i <= N; i++) {
		vi[i] = 0;
	}
}

int main(void) {
	int N = 0;
	int M = 0;
	int V = 0;
	
	scanf("%d %d %d", &N, &M, &V);
	
	for (int i = 0; i < M; i++) {
		int s = 0;
		int d = 0;
		
		scanf("%d %d", &s, &d);
		
		mx[s][d] = 1;
		mx[d][s] = 1;
	}
	
	DFS(V, N);
	
	init(N);
	
	BFS(V, N);
	
	return 0;
}