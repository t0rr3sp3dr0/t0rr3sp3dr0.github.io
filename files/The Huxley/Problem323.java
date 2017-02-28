import java.util.Scanner;

public class Problem323 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		while (true) {
			int in = keyboard.nextInt();
			if (in == 0)
				break;
			int[][] matrix = new int[in][in];
			int count = 1;
			for (int i = 0; i < in / 2 + in % 2; i++) {
				for (int j = i; j < in - i; j++) {
					matrix[i][j] = count;
					matrix[in - i - 1][j] = count;
					matrix[i][in - j - 1] = count;
					matrix[in - i - 1][in - j - 1] = count;
					matrix[in - j - 1][in - i - 1] = count;
					matrix[j][in - i - 1] = count;
					matrix[in - j - 1][i] = count;
					matrix[j][i] = count;
				}
				count++;
			}
			for (int i = 0; i < in; i++)
				for (int j = 0; j < in; j++) {
					System.out.print(matrix[i][j]);
					if (j != in - 1)
						System.out.print(" ");
					else
						System.out.println();
				}
			System.out.println();
		}
		keyboard.close();
	}

}
