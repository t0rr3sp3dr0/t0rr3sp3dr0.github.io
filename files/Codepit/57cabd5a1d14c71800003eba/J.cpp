#include <bits/stdc++.h>

using namespace std;

int main () {
    int count = 0;
    int in;
    scanf("%d", &in);
    for (int i = 0; i < in; i++) {
        float f;
        char c[3];
        scanf("%f %s", &f, c);
        if (strcmp(c, "kg") == 0)
            printf("%d %.4f lb\n", ++count, f * 2.2046);
        else if (strcmp(c, "lb") == 0)
            printf("%d %.4f kg\n", ++count, f * 0.4536);
        else if (strcmp(c, "l") == 0)
            printf("%d %.4f g\n", ++count, f * 0.2642);
        else if (strcmp(c, "g") == 0)
            printf("%d %.4f l\n", ++count, f * 3.7854);
    }
    return 0;
}
