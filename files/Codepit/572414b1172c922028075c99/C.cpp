#include <bits/stdc++.h>
using namespace std;

int main() {
    int i;
    int j;
    scanf("%d %d", &i, &j);
    int matrix[i][j];
    for(int x = 0; x < i; x++)
        for(int y = 0; y < j; y++)
            scanf("%d", &matrix[x][y]);
    int c = 0;
    bool zero = false;
    for(int x = 0; x < i; x++) {
        if (zero)
            c = j;
        zero = true;
        for(int y = 0; y < j; y++) {
            if (zero && matrix[x][y] != 0)
                zero = false;
            if (x == 0 && y == 0) {
                zero = false;
                break;
            }
            else if (matrix[x][y] != 0 && y <= c) {
                printf("N\n");
                return 0;
            } else if (matrix[x][y] != 0 && y > c) {
                c = y;
                break;
            }
        }
    }
    printf("S\n");
    return 0;
}