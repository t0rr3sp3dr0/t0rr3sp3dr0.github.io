#include <bits/stdc++.h>

using namespace std;

int main() {
	int n, k;
	scanf("%d %d", &n, &k);
	set<int> s;
	int counter = 0;
	for (int i = 0; i < n; i++) {
		int x;
		scanf("%d", &x);
		s.insert(x);
	}
	for (set<int>::iterator it = s.begin(); it != s.end(); it++)
		if (s.count(*it + k))
			counter++;
	printf("%d\n", counter);
}