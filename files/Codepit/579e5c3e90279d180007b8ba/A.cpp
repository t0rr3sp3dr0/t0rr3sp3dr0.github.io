#include <bits/stdc++.h>

using namespace std;

    long long int matrix[101][101];

    void combination() {
        for (int i = 0; i <= 100; i++)
            matrix[i][i] = matrix[i][0] = 1;
        for (int i = 2; i <= 100; i++)
            for (int j = 1; j < i; j++)
                matrix[i][j] = matrix[i - 1][j - 1] + matrix[i - 1][j];
    }

int main() {
    combination();

    while (true) {
        int n, m;
        scanf("%d %d", &n, &m);
        if (n == 0 && m == 0)
            break;

        printf("%d things taken %d at a time is %lld exactly.\n", n, m, matrix[n][m]);
    }

    return 0;
}       
