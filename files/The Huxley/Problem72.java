import java.util.Scanner;


public class Problem72 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		int in = keyboard.nextInt();
		keyboard.nextLine();
		String[] input = keyboard.nextLine().split(" ");
		keyboard.close();
		for (int i = 0; i < in; i++) {
			System.out.print(input[input.length - i - 1]);
			if (i != input.length - 1)
				System.out.print(" ");
		}
	}

}
