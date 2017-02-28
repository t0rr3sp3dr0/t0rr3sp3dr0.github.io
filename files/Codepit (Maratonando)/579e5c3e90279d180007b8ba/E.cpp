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

long long int catalao(int i) {
    return matrix[2 * i][i] - matrix[2 * i][i + 1];
}

int main() {
    combination();
    
    int n;
    scanf("%d", &n);

    while (true) {
        printf("%lld\n", catalao(n));
        if (scanf("%d", &n) != EOF)
            printf("\n");
        else
            break;
    }

    return 0;
}       
