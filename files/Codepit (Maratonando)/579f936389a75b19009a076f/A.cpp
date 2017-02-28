#include <bits/stdc++.h>

using namespace std;

int main() {
	int in;
	scanf("%d", &in);
	int i = in + (76 - ((in - 1986) % 76));
	printf("%d\n", i);
}