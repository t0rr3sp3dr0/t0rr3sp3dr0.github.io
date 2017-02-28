#include <bits/stdc++.h>

using namespace std;

int f91(int n) {
    if (n <= 100)
        return f91(f91(n + 11));
    else
        return n - 10;
}

int main () {
    while (true) {
        int i;
        scanf("%d", &i);
        if (i == 0)
            break;
        printf("f91(%d) = %d\n", i, f91(i));
    }
}
