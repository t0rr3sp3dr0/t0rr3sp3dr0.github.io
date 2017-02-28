#include <bits/stdc++.h>
using namespace std;

int main() {
	for (int i; i < 3; i++) {
		int a;
		int b;
		int c;
		while (scanf("%d %d %d", &a, &b, &c) == 3) {
			if (a == b && b == c)
				printf("*\n");
			else if (a == b)
				printf("C\n");
			else if (a == c)
				printf("B\n");
			else if (b == c)
				printf("A\n");
		}
	}
	return 0;
}
