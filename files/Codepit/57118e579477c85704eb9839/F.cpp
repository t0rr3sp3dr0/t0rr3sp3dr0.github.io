#include <bits/stdc++.h>
using namespace std;

int main() {
	vector<string> v;
	map<string, int> counter;
	string name, university;
	int in;
	while(cin >> in) {
		for (int i = 0; i < in; i++) {
			cin >> name >> university;
			counter[university]++;
			if (counter[university] == 1)
				v.push_back(university);
		}
	}
	for (int i = 0; i < v.size(); i++)
		cout << v[i] << " " << counter[v[i]] << "\n";
	return 0;
}

