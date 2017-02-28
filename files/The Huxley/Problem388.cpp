#if __APPLE__
#include "stdc++.h"
#else
#include <bits/stdc++.h>
#endif

using namespace std;

int main() {
	int n, m;
	scanf("%d %d", &n, &m);

	int col = -1;

	for (int i = 0; i < n; i++)
		for (int j = 0; j < m; j++) {
			int k;
			scanf("%d", &k);

			if (k != 0 || j == m - 1) {
				if (j <= col && k != 0) {
					printf("N\n");
					return 0;
				} else {
					col = j;
					for (++j; j < m; j++)
						scanf("%d", &k);
					break;
				}
			}
		}

	printf("S\n");

	return 0;
}
