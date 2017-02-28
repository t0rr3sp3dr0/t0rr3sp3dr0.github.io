#include <bits/stdc++.h>

using namespace std;

int main () {
    int in;
    scanf("%d", &in);
    for (int i = 0; i < in; i++) {
        int x, y;
        scanf("%d %d", &x, &y);
        if (x < y)
            printf("<\n");
        else if (x == y)
            printf("=\n");
        else if (x > y)
            printf(">\n");
    }

    return 0;
}
