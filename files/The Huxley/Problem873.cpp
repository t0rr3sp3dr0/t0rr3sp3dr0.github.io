#include <iostream>
#include <cstdint>
#include <cstring>

using namespace std;

int binary_search(int *v, int size, int x);
void quicksort(int *v, int size);
void quicksort(int *v, int l, int r);
int partition(int *v, int l, int r);

int n, m;
int64_t k = 0;
int v[1000001];
int o[1000001];
bool b[1000001];

int main() { 
    scanf("%d %d", &n, &m);
    
    for (int i = 0; i < n; i++)
        scanf("%d", &v[i]);

    memcpy(o, v, n * sizeof(int));
    quicksort(o, n);

    int size = n;
    for (int i = 0; i < n; i++) {
        int j = binary_search(o, size--, v[i]);
        k += j;
        if (j != size)
            memmove(o + j, o + j + 1, (size - j) * sizeof(int));
    }

    for (int i = 0; i < n; i++) {
        int j = 0;
        while (true) {
            int hash = (v[i] + k * j) % m;
            if (b[hash])
                j++;
            else {
                b[hash] = true;
                printf("%ld\n", hash);
                break;
            }
        }
    }

    return 0;
}

int binary_search(int *v, int size, int x) {
    int l = 0;
    int r = size - 1;
    do {
        int m = (l + r) / 2;
        if (x == v[m])
            return m;
        if (x < v[m])
            r = m - 1;
        else
            l = m + 1;
    } while (l <= r);
    return -1;
}

void quicksort(int *v, int size) {
    quicksort(v, 0, size - 1);
}

void quicksort(int *v, int l, int r) {
    if (l >= r)
        return;
    int k = v[l];
    v[l] = v[(l + r) / 2];
    v[(l + r) / 2] = k;
    int p = partition(v, l, r);
    quicksort(v, l, p - 1);
    quicksort(v, p + 1, r);
}

int partition(int *v, int l, int r) {
    int i = l + 1;
    int j = r;
    do {
        while (v[i] < v[l])
            i++;
        while (v[j] > v[l])
            j--;
        if (i < j) {
            int k = v[i];
            v[i] = v[j];
            v[j] = k;
        }
    } while (i < j);
    int k = v[l];
    v[l] = v[j];
    v[j] = k;
    return j;
}
