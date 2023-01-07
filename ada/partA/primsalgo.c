#include <stdio.h>

int prim(int a[50][50], int n, int src){
	int sum, i, j, d[50], min,p[50], s[50], u, v;
	for(i=1; i <= n; i++){
		d[i]=a[src][i];
		s[i] = 0;
		p[i]=src;
	}
	sum = 0;
	s[src] = 1;
	for(i = 1; i <= n-1; i++){
		min=999;
		for(j=1; j <= n; j++){
			if(s[j] == 0){
				if(d[j] < min){
					min = d[j];
					u = j;
				}
			}
		}
		s[u] = 1;
		sum=sum + d[u];
		printf("%d --> %d : %d \n", p[u],u, min);
		for(v = 1; v <= n; v++){
			if(s[v] == 0){
				if(a[u][v] < d[v]){
					d[v] = a[u][v];
					p[v] = u;
				}		
			}
		}
	}
	return sum;
}

void main(){
	int u,v,a[50][50],src,n,cost;
	printf("\n Enter the number of nodes: ");
	scanf("%d", &n);
	printf("\n Enter the matrix : \n");
	for(u=1; u <= n; u++){
		for(v=1; v <= n; v++){
			scanf("%d", &a[u][v]);
		}
	}
	printf("\n Enter the source node : ");
	scanf("%d", &src);
	cost = (int)prim(a,n,src);
	printf("\n The min cost of graph is : \t %d", cost);
	getch();
}
