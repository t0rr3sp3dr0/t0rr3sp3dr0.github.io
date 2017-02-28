#include <bits/stdc++.h>

using namespace std;

int fat(int n) {
    if (n == 0)
        return 1;
    return n * fat(n - 1);
}

int main () {
    int i;
    scanf("%d", &i);
    printf("%d\n", fat(i));
}
