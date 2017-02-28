#include <bits/stdc++.h>
using namespace std;

int main() {
	int n;
	scanf("%d", &n);
	for (int i = 0; i < n; i++) {
		int x;
		scanf("%d", &x);
		int y;
		scanf("%d", &y);
		if (x == y)
			printf("=\n");
		else if (x > y)
			printf(">\n");
		else if (x < y)
			printf("<\n");
	}
	return 0;
}
