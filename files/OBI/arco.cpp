#include <bits/stdc++.h>

using namespace std;

typedef struct point {
    float x, y;

    point() {
        x = 0;
        y = 0;
    }

    point(float x, float y) {
        this->x = x;
        this->y = y;
    }

    float size() {
        return sqrt(pow(x, 2) + pow(y, 2));
    }
} line;

vector<point> arrows;

int main () {
    int n;
    scanf("%d", &n);

    int p = 0;
    for (int i = 0; i < n; i++) {
        int x, y;
        scanf("%d %d", &x, &y);
        x += p;
        y += p;
        p = 0;

        point arrow = point(x, y);
        int size = arrow.size();

        for (int i = 0; i < arrows.size(); i++) {
            if (arrows[i].size() <= size)
                p++;
        }

        arrows.push_back(arrow);

        printf("%d\n", p);
    }

    return 0;
}
