#include <bits/stdc++.h>

using namespace std;

int main() {
	int in;
	scanf("%d", &in);
	vector<int> v;
	for (int i = 0; i < in; i++) {
		int j;
		scanf("%d", &j);
		v.push_back(j);
	}
	sort(v.begin(), v.end());
	for (vector<int>::iterator it = v.begin(); it != v.end(); it++)
		printf("%d\n", *it);
}