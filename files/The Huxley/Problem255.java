import java.util.Scanner;


public class Problem255 {

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
		for (int i = 0; i < in; i++)
			System.out.println(numbers[in - i - 1] * 2);
	}

}
