import java.util.Scanner;


public class Problem8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		while (true) {
			int n = keyboard.nextInt();
			int m = keyboard.nextInt();
			if (n == 0 && m == 0)
				break;
			else if (n == 0 || m == 0) {
				System.out.println("0.00");
				continue;
			}
			int[][] matrix = new int[n][m];
			int value = 1;
			float t = 0;
			float a = 0;
			float b = 0;
			float c = 0;
			float d = 0;
			float x = 0;
			float y = 0;
			for (int i = 0; i < n; i++)
				for (int j = 0; j < m; j++)
					matrix[i][j] = value++;
			for (int i = 0; i < n; i++)
				for (int j = 0; j < m; j++)
					t += matrix[i][j];
			for (int i = 0; i < n; i++)
				a += matrix[i][0];
			for (int i = 0; i < n; i++)
				b += matrix[i][m - 1];
			for (int i = 0; i < m; i++)
				c += matrix[0][i];
			for (int i = 0; i < m; i++)
				d += matrix[n - 1][i];
			if (n > m) {
				for (int i = 0; i < m; i++)
					x += matrix[i][i];
				for (int i = 0; i < m; i++)
					y += matrix[n - i - 1][m - i - 1];
			} else {
				for (int i = 0; i < n; i++)
					x += matrix[i][i];
				for (int i = 0; i < n; i++)
					y += matrix[n - i - 1][m - i - 1];
			}
			System.out.println(String.format("%.2f", ( t - (x+y) + (a *b) - (c*d) ) / (n*m)));
		}
		keyboard.close();
	}

}
