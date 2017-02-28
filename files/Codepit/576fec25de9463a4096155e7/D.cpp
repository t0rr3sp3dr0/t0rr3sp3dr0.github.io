#include <bits/stdc++.h>
using namespace std;

int main() {
	char in[101];
	memset(in, '\0', 101);
	scanf("%s", in);
	int l = 0;
	int u = 0;
	for (int i = 0; i < 100; i++) {
		if (in[i] >= 65 && in[i] <= 90)
			u++;
		else if (in[i] >= 97 && in[i] <= 122)
			l++;
	}
	if (l >= u){
		for (int i = 0; i < 100; i++)
			if (in[i] >= 65 && in[i] <= 90)
				in[i] += 32;
	} else {
		for (int i = 0; i < 100; i++)
			if (in[i] >= 97 && in[i] <= 122)
				in[i] -= 32;
	}
	printf("%s\n", in);
}
