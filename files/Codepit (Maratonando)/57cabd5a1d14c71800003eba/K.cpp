#include <bits/stdc++.h>

using namespace std;

int main () {
    int m, n;
    while (scanf("%d %d", &m, &n) != EOF) {
        if (m == 0 && n == 0)
            break;

        char matrix[m][n + 1];
        for (int i = 0; i < m; i++)
            scanf("%s", matrix[i]);
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int count = 0;
                if (matrix[i][j] == '.') {
                    if (i > 0 && matrix[i - 1][j] == '*')
                        count++;
                    if (j > 0 && matrix[i][j - 1] == '*')
                        count++;
                    if (i > 0 && j > 0 && matrix[i - 1][j - 1] == '*')
                        count++;
                    if (i < m - 1 && matrix[i + 1][j] == '*')
                        count++;
                    if (j < n - 1 && matrix[i][j + 1] == '*')
                        count++;
                    if (i < m - 1 && j < n - 1 && matrix[i + 1][j + 1] == '*')
                        count++;
                    if (i > 0 && j < n - 1 && matrix[i - 1][j + 1] == '*')
                        count++;
                    if (i < m - 1 && j > 0 && matrix[i + 1][j - 1] == '*')
                        count++;
                    printf("%d", count);
                } else
                    printf("*");
            }
            printf("\n");
        }
    }
    return 0;
}
