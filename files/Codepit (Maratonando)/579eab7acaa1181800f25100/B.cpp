#include <bits/stdc++.h>

using namespace std;

int main() {
	int in;
	scanf("%d", &in);
	vector<int> v;
	int counter = 0;
	for (int i = 1; i <= in; i++)
		for (int j = 1; i * j <= in; j++)
			if (i >= j)
				counter++;
	printf("%d\n", counter);
}