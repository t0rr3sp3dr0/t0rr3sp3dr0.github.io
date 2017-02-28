#if __APPLE__
#include "stdc++.h"
#else
#include <bits/stdc++.h>
#endif

using namespace std;

int main() {
	while (true) {
		int i;
		scanf("%d", &i);

		if (i == -1)
			break;

		if (i % 6 == 0)
			printf("Y\n");
		else
			printf("N\n");
	}

	return 0;
}
