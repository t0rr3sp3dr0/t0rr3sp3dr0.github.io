#include <bits/stdc++.h>
using namespace std;

int main() {
	int N;
	while (true) {
		scanf("%d", &N);
		if (N == 0)
			break;
		int out = 0;
		for(int i = 0; i < N; i++) {
			int C;
			int V;
			scanf("%d %d", &C, &V);
			out += (V / 2) * 2;
		}
		out /= 4;
		printf("%d\n", out);
	}
	return 0;
}
