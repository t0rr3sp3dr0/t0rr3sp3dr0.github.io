#include <bits/stdc++.h>
using namespace std;

int main() {
	long int a;
	long int b;
	while (scanf("%ld %ld", &a, &b) != EOF)
		printf("%ld\n", abs(b - a));
	return 0;
}
