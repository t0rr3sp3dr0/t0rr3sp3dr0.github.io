#include <bits/stdc++.h>

using namespace std;

double kadane(vector<double> v, int m) {
	int biggestSum = 0;
	int sumSoFar = 0;

	int first = -1;

	for (int i = 0; i < v.size(); i++) {
		if (sumSoFar == 0)
			first = i;
		sumSoFar += v[i];
		if (sumSoFar > m) {
			while (sumSoFar > m)
				sumSoFar -= v[first++];
		}
		biggestSum = max(biggestSum, sumSoFar);
	}

	return biggestSum;
}

int main() {
	int n, m;
	scanf("%d %d", &n, &m);

	vector<double> v;
	for (int i = 0; i < n; i++) {
		double d;
		scanf("%lf", &d);
		v.push_back(d);
	}

	printf("%.lf\n", kadane(v, m));

	return 0;
}