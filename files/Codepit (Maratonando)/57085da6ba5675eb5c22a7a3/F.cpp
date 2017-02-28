#include <bits/stdc++.h>
using namespace std;

int main() {
	int in;
	int loops = 0;
	while (true) {
		scanf("%d", &in);
		if (in == 0)
			break;
		else if (loops > 0)
			printf("\n");
		int count = 0;
		for (int a = 0; a < 10; a++) {
			for (int b = 0; b < 10; b++) {
				if (b != a) {
					for (int c = 0; c < 10; c++) {
						if (c != b && c != a) {
							for (int d = 0; d < 10; d++) {
								if (d != c && d != b && d != a) {
									for (int e = 0; e < 10; e++) {
										if (e != d && e != c && e != b && e != a) {
											for (int f = 0; f < 10; f++) {
												if (f != e && f != d && f != c && f != b && f != a && f <= a) {
													for (int g = 0; g < 10; g++) {
														if (g != f && g != e && g != d && g != c && g != b && g != a && (f * 10 + g) <= (a * 10 + b)) {
															for (int h = 0; h < 10; h++) {
																if (h != g && h != f && g != e && g != d && g != c && g != b && g != a && (f * 100 + g * 10 + h) <= (a * 100 + b * 10 + c)) {
																	for (int i = 0; i < 10; i++) {
																		if (i != h && i != g && i != f && i != e && i != d && i != c && i != b && i != a && (f * 1000 + g * 100 + h * 10 + i) <= (a * 1000 + b * 100 + c * 10 + d)) {
																			for (int j = 0; j < 10; j++) {
																				if (j != i && j != h && j != g && j != f && j != e && j != d && j != c && j != b && j != a && (f * 10000 + g * 1000 + h * 100 + i * 10 + j) <= (a * 10000 + b * 1000 + c * 100 + d * 10 + e)) {
																					double num = a * 10000 + b * 1000 + c * 100 + d * 10 + e;
																					double den = f * 10000 + g * 1000 + h * 100 + i * 10 + j;
																					if (num / den == (double) in) {
																						count++;
																						if (a == 0 && f == 0)
																							printf("0%d / 0%d = %d\n", (int) num, (int) den, in);
																						else if (a == 0)
																							printf("0%d / %d = %d\n", (int) num, (int) den, in);
																						else if (f == 0)
																							printf("%d / 0%d = %d\n", (int) num, (int) den, in);
																						else
																							printf("%d / %d = %d\n", (int) num, (int) den, in);
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		if (count == 0)
			printf("There are no solutions for %d.\n", in);
		loops++;
	}
	return 0;
}
