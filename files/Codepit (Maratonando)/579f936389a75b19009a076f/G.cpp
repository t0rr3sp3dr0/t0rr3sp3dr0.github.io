#include <bits/stdc++.h>

using namespace std;

vector<int> v[20000];

bool tree = true;

bool b[20000];
void dfs(int i) {
	if (b[i]) {
		tree = false;
		return;
	}
	b[i] = true;
	for (int j = 0; j < v[i].size(); j++)
		dfs(v[i][j]);
}

int main() {
	int n, m;
	scanf("%d %d", &n, &m);

	memset(b, false, sizeof(b));
	for (int i = 0; i < 20000; i++)
		v[i].clear();


	for (int i = 0; i < m; i++) {
		int x, y;
		scanf("%d %d", &x, &y);

		x--;
		y--;

		v[x].push_back(y);
	}

	dfs(0);
	for (int i = 0; i < n; i++)
		if (!b[i]) {
			tree = false;
			break;
		}

	if (tree)
		printf("YES\n");
	else
		printf("NO\n");
}