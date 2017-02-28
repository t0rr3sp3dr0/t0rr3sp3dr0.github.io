#include <bits/stdc++.h>

using namespace std;

int main () {
    int n, x, y, z;
    scanf("%d %d %d %d", &n, &x, &y, &z);
    set<int> s;
    s.insert(x);
    s.insert(y);
    s.insert(z);
    int sum = 0;
    int count = 0;
    for (set<int>::iterator it = s.begin(); it != s.end(); it++) {
        sum += *it;
        if (sum <= n)
            count++;
    }
    printf("%d\n", count);
    return 0;
}
