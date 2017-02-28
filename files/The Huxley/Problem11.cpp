#include <bits/stdc++.h>

using namespace std;

int main() {
	while (true) {
		int n, m;
		scanf("%d %d", &n, &m);
		if (n == 0 && m == 0)
			break;
		vector< pair<string, string> > v;
		for (int i = 0; i < n; i++) {
			char in[USHRT_MAX];
			char out[USHRT_MAX];
			scanf("%s -> %s", in, out);
			v.push_back(make_pair(string(in), string(out)));
		}
		for (int i = 0; i < m; i++) {
			char in[USHRT_MAX];
			scanf(" %[^\n]", in);
			string s = string(in);
			for (int j = 0; j < v.size(); j++) {
				int k = 0;
				while (s.substr(k).find(v[j].first) != string::npos) {
					s.replace(s.begin() + s.substr(0, k).length() + s.substr(k).find(v[j].first), s.begin() + s.substr(0, k).length() + s.substr(k).find(v[j].first) + v[j].first.length(), v[j].second);
					k = s.substr(0, k).length() + s.substr(k).find(v[j].second) + v[j].second.length();
				}
			}
			printf("%s\n", s.c_str());
		}
	}

	return 0;
}
