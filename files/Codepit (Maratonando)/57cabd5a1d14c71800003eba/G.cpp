#include <bits/stdc++.h>

using namespace std;

int main () {
    int a, b, c, d, e;
    int f, g, h, i, j;
    while (scanf("%d %d %d %d %d %d %d %d %d %d", &a, &b, &c, &d, &e, &f, &g, &h, &i, &j) != EOF) {
        if (a != f && b != g && c != h && d != i && e != j) 
            printf("Y\n");
        else
            printf("N\n");
    }

    return 0;
}
