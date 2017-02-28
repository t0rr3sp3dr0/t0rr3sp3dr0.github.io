import java.util.Arrays;
import java.util.Scanner;


public class Problem152 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		int in = keyboard.nextInt();
		int[] numbers = new int[in];
		for (int i = 0; i < in; i++)
			numbers[i] = keyboard.nextInt();
		keyboard.close();
		for (int i = 0; i < in; i++) {
			System.out.print(numbers[in - i - 1]);
			if (i != in - 1)
				System.out.print(" ");
		}
		System.out.println();
		for (int i = 1; i <= in; i++) {
			if (i == in)
				System.out.print(numbers[0]);
			else
				System.out.print(numbers[i] + " ");
		}
		System.out.println();
		Arrays.sort(numbers);
		for (int i = 0; i < in; i++) {
			System.out.print(numbers[in - i - 1]);
			if (i != in - 1)
				System.out.print(" ");
		}
	}

}
