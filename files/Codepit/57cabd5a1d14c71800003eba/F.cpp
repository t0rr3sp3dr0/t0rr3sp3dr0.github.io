#include <bits/stdc++.h>

using namespace std;

int main () {
    vector<int> v;
    int in;
    scanf("%d", &in);
    for (int i = 0; i < in; i++) {
        int n, a, d;
        scanf("%d %d %d", &n, &a, &d);
        int x = a;
        int y = a;
        for (int j = 0; j < n - 1; j++) {
            y += d;
            x += y;
        }
        printf("%d\n", x);
    }

    return 0;
}
