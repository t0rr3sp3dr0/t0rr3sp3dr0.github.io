import java.util.Scanner;


public class Problem79 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		while (true) {
			int in = keyboard.nextInt();
			if (in == 0)
				break;
			int[][] matrix = new int[4][4];
			for (int i = 0; i < 4; i++)
				for (int j = 0; j < 4; j++)
					matrix[j][i] = keyboard.nextInt();
			for (int i = 0; i < 4; i++)
				matrix[i][i] *= in;
			for (int i = 0; i < 4; i++)
				for (int j = 0; j < 4; j++) {
					System.out.print(matrix[i][j]);
					if (j != 3)
						System.out.print(" ");
					else
						System.out.println(" ");
				}
		}
		keyboard.close();
	}

}
