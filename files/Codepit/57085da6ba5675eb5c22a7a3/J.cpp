#include <bits/stdc++.h>
using namespace std;

int main() {
	long int i;
	long int j;
	while(scanf("%ld %ld", &i, &j) != EOF) {
		if (i > j)
			printf("%ld\n", i - j);
		else
			printf("%ld\n", j - i);
	}
}
