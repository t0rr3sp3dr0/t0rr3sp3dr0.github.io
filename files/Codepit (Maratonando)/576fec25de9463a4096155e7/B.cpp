#include <bits/stdc++.h>
using namespace std;

long int numberOfCycles(long int in) {
	long int i = 0;
	while (in != 1) {
		i++;
		if (in % 2 != 0)
			in = (3 * in) + 1;
		else
			in = in / 2;
	}
	i++;
	return i;
}

int main() {
	long int cycles[1000000];
	for (long int i = 1; i < 1000000; i++) {
		cycles[i] = numberOfCycles(i);
	}
	long int a;
	long int b;
	while (scanf("%ld %ld", &a, &b) != EOF) {
		bool change = a > b;
		if (change) {
			long int c = a;
			a = b;
			b = c;
		}
		long int max = -1;
		for (long int i = a; i <= b; i++)
			if (cycles[i] > max)
				max = cycles[i];
		if (change)
			printf("%ld %ld %ld\n", b, a, max);
		else
			printf("%ld %ld %ld\n", a, b, max);
	}
	return 0;
}
