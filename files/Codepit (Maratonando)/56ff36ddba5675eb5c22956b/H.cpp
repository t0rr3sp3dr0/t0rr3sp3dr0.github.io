#include <bits/stdc++.h>
using namespace std;

int main() {
	int n;
	int m;
	int A[10000];
	scanf("%d %d", &n, &m);
	for (int i = 0; i < n; i++)
		scanf("%d", &A[i]);
	for (int c = 0; c < (n - 1); c++)
		for (int d = 0; d < n - c - 1; d++)
      			if (A[d] < A[d + 1]) {
				int swap = A[d];
				A[d] = A[d + 1];
				A[d + 1] = swap;
			};
	for (int i = 0; i < m; i++)
		printf("%d\n", A[i]);
	return 0;
}
