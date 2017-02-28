#include <bits/stdc++.h>
using namespace std;

int main() {
	int c;
	scanf("%d", &c);
	for (int i = 0; i < c; i++) {
		int o = 0;
		int s;
		scanf("%d", &s);
		for (int j = 0; j < s; j++) {
			int n;
			scanf("%d", &n);
			if (n > o)
				o = n;
		}
		printf("Case %d: %d\n", i + 1, o);
	}
	return 0;
}
