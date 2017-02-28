#include <bits/stdc++.h>
#define add(i, x) graph[(i)].push_back((x))

using namespace std;

vector<int> graph[100001];
bool seen[100001];
bool team[100001];
set<int> a;
set<int> b;

void bfs() {
    memset(seen, false, sizeof seen);
    queue<int> q;
    q.push(1);
    team[1] = true;
    while (!q.empty()) {
        int f = q.front();
        q.pop();
        seen[f] = true;
        if (team[f])
            a.insert(f);
        else
            b.insert(f);
        for (int i = 0; i < int(graph[f].size()); i++) {
            int j = graph[f][i];
            if (!seen[j]) {
                q.push(j);
                team[j] = !team[f];
            }
        }
    }
}

int main () {
    int n;
    scanf("%d", &n);
    for (int i = 0; i < n; i++) {
        int m;
        scanf("%d", &m);
        for (int j = 0; j < m; j++) {
            int x;
            scanf("%d", &x);
            add(i + 1, x);
        }
    }

    bfs();

    for (set<int>::iterator it = a.begin(); it != a.end(); it++)
        printf("%d ", *it);
    printf("\n");
    for (set<int>::iterator it = b.begin(); it != b.end(); it++)
        printf("%d ", *it);
    printf("\n");

    return 0;
}
