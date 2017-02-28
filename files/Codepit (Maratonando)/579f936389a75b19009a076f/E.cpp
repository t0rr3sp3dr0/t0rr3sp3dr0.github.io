#include <bits/stdc++.h>

using namespace std;

int main() {
	int counter = 0;
	while (true) {
		counter++;
		int in;
		scanf("%d", &in);
		if (in == 0)
			break;
		int max = 0;
		vector<int> v;
		for (int i = 0; i < in; i++) {
			int a, b;
			scanf("%d %d", &a, &b);
			if (b > max) {
				max = b;
				v.erase(v.begin(), v.end());
				v.push_back(a);
			} else if (b == max) {
				v.push_back(a);
			}
		}
		printf("Turma %d\n", counter);
		for (int i = 0; i < v.size(); i++)
			printf("%d ", v[i]);
		printf("\n\n");
	}
}