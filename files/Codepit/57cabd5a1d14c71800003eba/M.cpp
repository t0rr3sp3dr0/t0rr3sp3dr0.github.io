#include <bits/stdc++.h>

using namespace std;

int p[3];

int main () {
    p[0] = 0;
    p[1] = 0;
    p[2] = 0;

    int in;
    cin >> in;
    string s;
    getline(cin, s);
    for (int i = 0; i < in; i++) {
        getline(cin, s);
        if (s.compare("Emperor Penguin") == 0)
            p[0]++;
        else if (s.compare("Little Penguin") == 0)
            p[1]++;
        else if (s.compare("Macaroni Penguin") == 0)
            p[2]++;
    }
    
    if (p[0] > p[1] && p[0] > p[2])
        cout << "Emperor Penguin\n";
    else if (p[1] > p[0] && p[1] > p[2])
        cout << "Little Penguin\n";
    else
        cout << "Macaroni Penguin\n";

    return 0;
}