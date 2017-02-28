#include <bits/stdc++.h>

using namespace std;

int main () {
    ios::sync_with_stdio(false);

    int size;
    cin >> size;
    
    int *in = (int *) malloc(size * sizeof(int));
    for (int i = 0; i < size; i++)
        cin >> in[i];
    
    int offset;
    cin >> offset;
    
    for (int i = offset; i < size + offset; i++)
        cout << in[i % size] << endl;

    return 0;
}
