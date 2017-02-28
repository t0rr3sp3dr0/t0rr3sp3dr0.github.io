import java.util.Scanner;

public class Problem773 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		double[][] matrix = new double[4][3];
		for (int i = 0; i < 4; i++)
			for (int j = 0; j < 3; j++)
				matrix[i][j] = keyboard.nextDouble();
		int line = keyboard.nextInt();
		keyboard.close();
		if (line > 0 && line <= 4) {
			double sum = 0;
			for (int i = 0; i < 3; i++)
				sum += matrix[line - 1][i];
			System.out.println(sum / 3);
		} else
			System.out.println("Linha incorreta!");
	}

}
