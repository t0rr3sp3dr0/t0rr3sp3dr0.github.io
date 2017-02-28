#if __APPLE__
#include "stdc++.h"
#else
#include <bits/stdc++.h>
#endif

using namespace std;

int main() {
	int t;
	scanf("%d", &t);

	for (int i = 0; i < t; i++) {
		int n;
		scanf("%d", &n);

		int q[10000];
		int s[10000];

		int beginQ = 0;
		int beginS = 0;

		int endQ = 0;
		int endS = 0;

		bool isQ = true;
		bool isS = true;

		for (int j = 0; j < n; j++) {
			int o, x;
			scanf("%d %d", &o, &x);

			if (o == 1) {
				q[endQ++] = x;
				s[endS++] = x;
			} else {
				if (q[beginQ++] != x)
					isQ = false;
				if (s[--endS] != x)
					isS = false;
			}
		}

		if (isQ && isS)
			printf("caso %d: ambas\n", i + 1);
		else if (isQ)
			printf("caso %d: fila\n", i + 1);
		else if (isS)
			printf("caso %d: pilha\n", i + 1);
		else
			printf("caso %d: nenhuma\n", i + 1);
	}

	return 0;
}
