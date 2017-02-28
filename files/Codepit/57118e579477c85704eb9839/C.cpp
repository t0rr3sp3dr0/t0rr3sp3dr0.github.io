#include <bits/stdc++.h>
using namespace std;

int main() {
	int in;
	while (cin >> in) {
		map<char, int> table;
		int count;
		cin >> count;
		for (int i = 0; i < count; i++) {
			char character;
			int price;
			cin >> character >> price;
			table[character] = price;
		}
		int out = 0;
		cin >> count;
		string line;
		getline(cin, line);
		for (int i = 0; i < count; i++) {
			getline(cin, line);
			for (int j = 0; j <= line.length(); j++)
				out += table[line.c_str()[j]];
		}
		printf("%01.2f$\n", (double) out / 100);
	}
	return 0;
}

