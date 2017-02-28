#include <bits/stdc++.h>
using namespace std;

int main() {
	int c;
	int r;
	scanf("%d %d", &c, &r);
	int matrix[c][r];
	for(int i = 0; i < c; i++)
		for(int j = 0; j < r; j++)
			scanf("%d", &matrix[i][j]);
	int sCR = 0;
	int sRC = 0;
	for(int i = 0; i < c; i++) {
		int e = 0;
		for(int j = 0; j < r; j++)
			e += matrix[i][j];
		if (e > sCR)
			sCR = e;
	}
	for(int j = 0; j < r; j++) {
		int e = 0;
		for(int i = 0; i < c; i++)
			e += matrix[i][j];
		if (e > sRC)
			sRC = e;
	}
	if (sCR > sRC)
		printf("%d\n", sCR);
	else
		printf("%d\n", sRC);
	return 0;
}
