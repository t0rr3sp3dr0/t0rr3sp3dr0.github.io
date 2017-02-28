#include <bits/stdc++.h>
using namespace std;

int main() {
	int x0;
	int y0;
	int x;
	int y;
	while (true) {
		scanf("%d %d %d %d", &x0, &y0, &x, &y);
		if (x0 == 0 && y0 == 0 && x == 0 && y == 0)
			break;
		int mX;
		int mY;
		if (x0 - x < 0)
			mX = x - x0;
		else
			mX = x0 - x;
		if (y0 - y < 0)
			mY = y - y0;
		else
			mY = y0 - y;
		if (mX == 0 && mY == 0)
			printf("0\n");
		else if (mX == mY || mX == 0 || mY == 0)
			printf("1\n");
		else
			printf("2\n");
	}
	return 0;
}
