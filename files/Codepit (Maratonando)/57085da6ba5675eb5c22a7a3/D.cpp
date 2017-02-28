#include <bits/stdc++.h>
using namespace std;

int main() {
	int count = 1;
	int in;
	while (true) {
		scanf("%d", &in);
		if (in == 0)
			break;
		int sJ = 0;
		int sZ = 0;
		printf("Teste %d\n", count);
		for (int i = 0; i < in; i++) {
			int J;
			int Z;
			scanf("%d %d", &J, &Z);
			sJ += J;
			sZ += Z;
			printf("%d\n", sJ - sZ);
		}
		printf("\n");
		count++;
	}
	return 0;
}
