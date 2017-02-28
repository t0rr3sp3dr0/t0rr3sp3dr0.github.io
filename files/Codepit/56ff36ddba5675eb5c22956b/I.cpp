#include <bits/stdc++.h>
using namespace std;

int main() {
	int r;
	int c;
	while (1) {
		scanf("%d %d", &r, &c);
		if (r == 0 && c == 0)
			break;
		char in[r][c];
		for (int x = 0; x < r; x++) {
			char row[c + 1];
			scanf("%s", row);
			for (int y = 0; y < c; y++)
				in[x][y] = row[y];
		}
		for (int x = 0; x < r; x++) {
			for (int y = 0; y < c; y++) {
				if (in[x][y] == '*')
					printf("*");
				else {
					int counter = 0;
					if (x != 0 && y != 0)
						if (in[x - 1][y - 1] == '*')
							counter++;
					if (x != 0)
						if (in[x - 1][y] == '*')
							counter++;
					if (x != 0 && y != c - 1)
						if (in[x - 1][y + 1] == '*')
							counter++;
					if (y != 0)
						if (in[x][y - 1] == '*')
							counter++;
					if (in[x][y] == '*')
						counter++;
					if (y != c - 1)
						if (in[x][y + 1] == '*')
							counter++;
					if (x != r - 1 && y != 0)
						if (in[x + 1][y - 1] == '*')
							counter++;
					if (x != r - 1)
						if (in[x + 1][y] == '*')
							counter++;
					if (x != r - 1 && y != c - 1)
						if (in[x + 1][y + 1] == '*')
							counter++;
					printf("%d", counter);
				}
			}
			printf("\n");
		}
	}
	return 0;
}
