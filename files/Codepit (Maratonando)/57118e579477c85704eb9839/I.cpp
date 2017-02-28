#include <bits/stdc++.h>
using namespace std;

int main() {
	int in;
	scanf("%d", &in);
	vector<int> numbers;
	for (int i = 0; i < in; i++) {
		int j;
		cin >> j;
		numbers.push_back(j);
	}
	sort(numbers.begin(), numbers.end());
	for (int i = 0; i < in; i++) 
		cout << numbers[i] << "\n";
	return 0;
}

