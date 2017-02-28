#include <bits/stdc++.h>
using namespace std;

int main() {
    int array[5];
    for(int i = 0; i < 5; i++)
        scanf("%d", &array[i]);
    bool C = true;
    bool D = true;
    for(int i = 0; i < 4; i++) {
        if (array[i] > array[i + 1])
            C = false;
        if (array[i] < array[i + 1])
            D = false;
    }
    if (C)
        printf("C\n");
    else if (D)
        printf("D\n");
    else
        printf("N\n");
    return 0;
}