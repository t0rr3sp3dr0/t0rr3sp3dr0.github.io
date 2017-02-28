#include <bits/stdc++.h>
using namespace std;

int main() {
	int in;
	while (scanf("%d", &in) == 1) {
		int diff;
		bool jolly = true;
		int array[in];
		for (int i = 0; i < in; i++)
			scanf("%d", &array[i]);
		if (in > 1)
			diff = abs(array[0] - array[1]);
		else
			diff = array[0];
		for (int i = 0; i < in - 1; i++)
			if (abs(array[i] - array[i + 1]) != diff--)
				jolly = false;
		bool repeat = true;
		for (int i = 0; i < in - 1; i++)
			if (array[i] != array[i + 1])
				repeat = false;
		if (jolly || repeat)
			printf("Jolly\n");
		else
			printf("Not jolly\n");
	}
	return 0;
}

