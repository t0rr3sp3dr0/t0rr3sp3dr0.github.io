#include <bits/stdc++.h>

using namespace std;

int main () {
    int in;
    scanf("%d", &in);
    for (int i = 0; i < in; i++) {
        int t;
        scanf("%d", &t);
        int out = 0;
        for (int j = 0; j < t; j++) {
            int x;
            scanf("%d", &x);
            if (x > out)
                out = x;
        }
        printf("Case %d: %d\n", i + 1, out);
    }

    return 0;
}
