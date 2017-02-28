#include <bits/stdc++.h>
using namespace std;

int main() {
	int in;
	while (scanf("%d", &in) == 1) {
		int diff;
		bool jolly = true;
		int array[in];
		bool b[in];
		memset(b, false, in);
		for (int i = 0; i < in; i++)
			scanf("%d", &array[i]);
		if (sizeof(array) == 1 && array[0] == 1) {
			printf("Jolly\n");
			continue;
		}
		for (int i = 0; i < in - 1; i++)
			b[abs(array[i] - array[i + 1])] = true;
		bool nJ = false;
		for (int i = 1; i < in; i++) {
			if (!b[i]) {
				printf("Not jolly\n");
				nJ = true;
				break;
			}
		}
		if (nJ)
			continue;
		printf("Jolly\n");
	}
	return 0;
}
