#include <bits/stdc++.h>

using namespace std;

int kadane(vector<int> v) {
	int biggestSum = 0;
	int sumSoFar = 0;

	for (int i = 0; i < v.size(); i++) {
		sumSoFar += v[i];
		if (sumSoFar <= 0)
			sumSoFar = 0;
		else
			biggestSum = max(biggestSum, sumSoFar);
	}

	return biggestSum;
}

int main() {
	while (true) {
		int n;
		scanf("%d", &n);

		if (n == 0)
			break;

		vector<int> v;
		for (int i = 0; i < n; i++) {
			int j;
			scanf("%d", &j);
			v.push_back(j);
		}

		int max = kadane(v);
		if (max > 0)
			printf("The maximum winning streak is %d.\n", max);
		else
			printf("Losing streak.\n");
	}

	return 0;
}