#include <bits/stdc++.h>
using namespace std;

int main() {
	int count = 1;
	int in;
	while (true) {
		scanf("%d", &in);
		if (in == 0)
			break;
		int A = 0;
		int B = 0;
		for (int i = 0; i < in; i++) {
			int nA;
			int nB;
			scanf("%d %d", &nA, &nB);
			A += nA;
			B += nB;
		}
		printf("Teste %d\n", count);
		if (A > B)
			printf("Aldo\n");
		else if (B > A)
			printf("Beto\n");
		printf("\n");
		count++;
	}
	return 0;
}
