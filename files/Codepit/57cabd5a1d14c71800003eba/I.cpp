#include <bits/stdc++.h>

using namespace std;

int main () {
    vector<int> v;
    int n, m;
    scanf("%d %d", &n, &m);
    for (int i = 0; i < n; i++) {
        int x;
        scanf("%d", &x);
        v.push_back(x);
    }
    sort(v.begin(), v.end());
    for (int i = 0; i < m; i++)
        printf("%d\n", v[n - i - 1]);

    return 0;
}
