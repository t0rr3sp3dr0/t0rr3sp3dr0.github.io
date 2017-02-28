#include <bits/stdc++.h>
using namespace std;

int main() {
	int a;
	int b;
	int c = 0;
	while (1) {
		c++;
		scanf("%d %d", &a, &b);
		if (a == 0 && b == 0)
			break;
		int d = ceil((a - b) / (float) b);
		if (d < 0 || d > 26)
			printf("Case %d: impossible\n", c);
		else
			printf("Case %d: %d\n", c, d);
	}
}
