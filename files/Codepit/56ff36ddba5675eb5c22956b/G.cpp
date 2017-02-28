#include <bits/stdc++.h>
using namespace std;

int main() {
	int c = 0;
	while (1) {
		int n;
		scanf("%d", &n);
		if (n == 0)
			break;
		printf("Teste %d\n", c + 1);
		char p1[11];
		scanf("%s", p1);
		char p2[11];
		scanf("%s", p2);
		for (int i = 0; i < n; i++) {
			int n1;
			int n2;
			scanf("%d %d", &n1, &n2);
			if ((n1 + n2) % 2 == 0)
				printf("%s\n", p1);
			else
				printf("%s\n", p2);
		}
		printf("\n");
		c++;
	}
	return 0;
}
