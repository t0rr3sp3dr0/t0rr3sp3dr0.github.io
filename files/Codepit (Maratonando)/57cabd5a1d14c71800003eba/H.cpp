#include <bits/stdc++.h>

using namespace std;

int main () {
    int count = 0;
    int in;
    while (true) {
        scanf("%d", &in);
        if (in == 0)
            break;
        char a[11];
        char b[11];
        scanf("%s %s", a, b);
        printf("Teste %d\n", ++count);
        for (int i = 0; i < in; i++) {
            int x, y;
            scanf("%d %d", &x, &y);
            if ((x + y) % 2 == 0)
                printf("%s\n", a);
            else
                printf("%s\n", b);
        }
        printf("\n");
    }

    return 0;
}
