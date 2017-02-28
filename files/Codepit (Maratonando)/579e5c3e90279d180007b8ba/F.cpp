#include <bits/stdc++.h>

using namespace std;

int main() {
    int n;
    scanf("%d", &n);

    for (int i = 0; i < n; i++) {
        long long int l, u;
        scanf("%lld %lld", &l, &u);

        long long int x = 0, m = 0;
        for (long long int j = l; j <= u; j++) {
            int counter = 0;
            for (long long int k = 1; k <= sqrt(j); k++) {
                if (j == k * k)
                    counter++;
                else if (j % k == 0)
                    counter += 2;
            }
            if (counter > m) {
                x = j;
                m = counter;
            }
        }

        printf("Between %lld and %lld, %lld has a maximum of %lld divisors.\n", l, u, x, m);
    }

    return 0;
}       
