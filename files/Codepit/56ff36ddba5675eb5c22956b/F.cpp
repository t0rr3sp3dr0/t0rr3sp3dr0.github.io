#include <bits/stdc++.h>
using namespace std;

int main() {
	int I[5];
	int O[5];
	while (scanf("%d %d %d %d %d\n%d %d %d %d %d", &I[0], &I[1], &I[2], &I[3], &I[4], &O[0], &O[1], &O[2], &O[3], &O[4]) == 10) {
		bool b = true;
		for (int i = 0; i < 5; i++)
			if (I[i] == O[i])
				b = false;
		printf(b ? "Y\n" : "N\n");
	}
	return 0;
}
