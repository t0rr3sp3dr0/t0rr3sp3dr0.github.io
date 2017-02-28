#include <bits/stdc++.h>

using namespace std;

vector<int> v[100];

bool b[100];
void dfs(int i) {
	if (b[i])
		return;
	b[i] = true;
	for (int j = 0; j < v[i].size(); j++)
		dfs(v[i][j]);
}

int main() {
	int counter = 0;
	while (true) {
		counter++;
		int e, l;
		scanf("%d %d", &e, &l);
		if (e == 0 && l == 0)
			break;

		printf("Teste %d\n", counter);

		memset(b, false, sizeof(b));
		for (int i = 0; i < 100; i++)
			v[i].clear();

		for (int i = 0; i < l; i++) {
			int x, y;
			scanf("%d %d", &x, &y);

			x--;
			y--;

			v[x].push_back(y);
			v[y].push_back(x);
		}

		bool ok = true;
		dfs(0);
		for (int i = 0; i < e; i++)
			if (!b[i]) {
				ok = false;
				break;
			}
		if (ok)
			printf("normal\n");
		else
			printf("falha\n");
		printf("\n");
	}
}