#include <bits/stdc++.h>

using namespace std;

int main () {
    int x, y;
    scanf("%d %d", &x, &y);

    if (x == y)
        printf("%d\n", x);
    else
        printf("%d\n", max(x, y));

    return 0;
}
