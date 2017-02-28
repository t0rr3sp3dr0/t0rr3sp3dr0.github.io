#include <bits/stdc++.h>
using namespace std;

string az(string s) {
    int counter = 0;
    char c[s.length() + 1];
    memset(c, '\0', sizeof(c)); 
    for (int i = 0; i < s.length(); i++) {
        if (s.c_str()[i] >= 97 && s.c_str()[i] <= 122)
            c[counter++] = s.c_str()[i];
        else if (i != 0 && i != s.length() - 1)
            c[counter++] = ' ';
    }
    for (int i = 0; i < s.length() - 1; i++)
        if (c[i] == ' ' && c[i + 1] == '\0')
            c[i] = '\0';
    return string(c);
}

int main() {
    ios_base::sync_with_stdio(0);
    string in;
    string s;
    vector<string> words;
    while (cin >> s) {
        transform(s.begin(), s.end(), s.begin(), ::tolower);
        stringstream ss(az(s));
        while (getline(ss, s, ' '))
            if (s.length() > 0)
                words.push_back(s);
    }
    sort(words.begin(), words.end());
    for (int i = 0; i < words.size() - 1; i++)
        if (words[i] == words[i + 1]) {
            words.erase(words.begin() + i);
            i--;
        } else
            cout << words[i] << "\n";
    cout << words[words.size()] << "\n";
    return 0;
}

