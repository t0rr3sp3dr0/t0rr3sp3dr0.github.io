#include <bits/stdc++.h>
using namespace std;

int main() {
	int count = 1;
	int in;
	while (true) {
		scanf("%d", &in);
		if (in == 0)
			break;
		else if (count != 1)
			printf("\n");
		int S[in];
		for (int i = 0; i < in; i++)
			scanf("%d", &S[i]);
		for (int a = 0; a < in; a++) {
			for (int b = 0; b < in; b++) {
				if (S[b] != S[a] && S[b] > S[a]) {
					for (int c = 0; c < in; c++) {
						if (S[c] != S[b] && S[c] != S[a] && S[c] > S[b]) {
							for (int d = 0; d < in; d++) {
								if (S[d] != S[c] && S[d] != S[b] && S[d] != S[a] && S[d] > S[c]) {
									for (int e = 0; e < in; e++) {
										if (S[e] != S[d] && S[e] != S[c] && S[e] != S[b] && S[e] != S[a] && S[e] > S[d]) {
											for (int f = 0; f < in; f++) {
												if (S[f] != S[e] && S[f] != S[d] && S[f] != S[c] && S[f] != S[b] && S[f] != S[a] && S[f] > S[e]) {
													printf("%d %d %d %d %d %d\n", S[a], S[b], S[c], S[d], S[e], S[f]);
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		count++;
	}
	return 0;
}
