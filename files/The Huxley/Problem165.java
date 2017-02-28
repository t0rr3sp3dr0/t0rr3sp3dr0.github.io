import java.util.Scanner;


public class Problem165 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		int in = keyboard.nextInt();
		int[][] matrix = new int[in][in];
		for (int i = 0; i < in; i++)
			for (int j = 0; j < in; j++)
				matrix[i][j] = keyboard.nextInt();
		keyboard.close();
		int sum[] = new int[2 * in + 2];
		int count = 0;
		for (int i = 0; i < in; i++) {
			for (int j = 0; j < in; j++)
				sum[count] += matrix[i][j];
			count++;
		}
		for (int i = 0; i < in; i++) {
			for (int j = 0; j < in; j++)
				sum[count] += matrix[j][i];
			count++;
		}
		for (int i = 0; i < in; i++)
			sum[count] += matrix[i][i];
		count++;
		for (int i = 0; i < in; i++)
			sum[count] += matrix[in - i - 1][i];
		boolean magic = true;
		for (int i = 0; i < sum.length - 1; i++)
			if (sum[i] != sum[i + 1]) {
				magic = false;
				break;
			}
		if (magic)
			System.out.println(sum[0]);
		else
			System.out.println(-1);
	}

}
