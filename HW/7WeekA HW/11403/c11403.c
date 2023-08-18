#include<stdio.h>
#define p 100
main() {
	int i, j, k, n, d[101][101]; scanf("%d", &n);
	for (i = 1; i <= n; i++) for (j = 1; j <= n; j++) {
		scanf("%d", &d[i][j]);
		d[i][j] = (d[i][j] == 0 ? p
     : d[i][j]);
	}
	for (k = 1; k <= n; k++)
		for (i = 1; i <= n; i++)
			for (j = 1; j <= n; j++)
				if (d[i][j] > d[i][k] + d[k][j]) 
					d[i][j] = d[i][k] + d[k][j];
	for (int i = 1; i <= n; i++) {
		for (j = 1; j <= n; j++) 
			printf("%d ", d[i][j] == p
         ? 0 : 1);
		puts("");
	}
}