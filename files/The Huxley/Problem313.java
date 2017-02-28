import java.util.Scanner;

public class Problem313 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		int in = keyboard.nextInt();
		char c = keyboard.next().charAt(0);
		double[][] matrix = new double[12][12];
		for (int i = 0; i < 12; i++)
			for (int j = 0; j < 12; j++)
				matrix[i][j] = keyboard.nextDouble();
		keyboard.close();
		double sum = 0;
		for (int i = 0; i < 12; i++)
			sum += matrix[in][i];
		if (c == 'S' || c == 's')
			System.out.println(String.format("%.1f", sum));
		else if (c == 'M' || c == 'm')
			System.out.println(String.format("%.1f", sum/12));
	}

}
