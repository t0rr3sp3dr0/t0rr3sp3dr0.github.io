#include <bits/stdc++.h>

using namespace std;

int bs[1000000];

void crivo() {
    memset(bs, 1, sizeof bs);
    bs[0] = bs[1] = 0;
    for (long long int i = 2; i < 1000000; i++)
        if (bs[i])
            for (long long int j = i * i; j < 1000000; j += i)
                bs[j] = 0;
}

int main() {
    crivo();
    
    while (true) {
        int n;
        scanf("%d", &n);
        if (n == 0)
            break;

        for (int i = 3; i <= n / 2; i++)
            if (bs[i] && bs[n - i]) {
                printf("%d = %d + %d\n", n, i, n - i);
                break;
            }
    }

    return 0;
}       
