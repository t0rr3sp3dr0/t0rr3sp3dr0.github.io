#include <bits/stdc++.h>
using namespace std;

int main() {
    int N;
    int M;
    scanf("%d %d", &N, &M);
    long int c[N];
    long int e[M];
    for(int i = 0; i < N; i++)
        scanf("%ld", &c[i]);
    for(int i = 0; i < M; i++)
        scanf("%ld", &e[i]);
    long int now = 0;
    long int counter = 0;
    for (int i = 0; i < M; i++) {
        int index = lower_bound(c, c + N, e[i]) - c;
        counter += abs(now - index);
        now = index;
    }
    printf("%ld\n", counter);
    return 0;
}