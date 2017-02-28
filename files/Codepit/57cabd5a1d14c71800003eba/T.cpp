#include <bits/stdc++.h>

using namespace std;

int main () {
    char c;

    while (scanf("%c", &c) != EOF) {
        if (c >= 'A' && c <= 'Z')
            printf("%c", 'A' + (c - 'A' + 13) % 26);
        else if (c >= 'a' && c <= 'z')
            printf("%c", 'a' + (c - 'a' + 13) % 26);
        else
            printf("%c", c);
    }

    return 0;
}
