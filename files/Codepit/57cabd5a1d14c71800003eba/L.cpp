#include <bits/stdc++.h>

using namespace std;

int g(int i) {
    if (i < 10)
        return i;
    else {
        int num = i;
        int sum = 0;
        while (num > 9) {
            sum += num % 10;
            num = num / 10;
        }
        sum += num;
        return g(sum);
    }
}

int main () {
    int in;
    while (scanf("%d", &in) != EOF) {
        if (in == 0)
            break;
        printf("%d\n", g(in));    
    }
    return 0;
}
