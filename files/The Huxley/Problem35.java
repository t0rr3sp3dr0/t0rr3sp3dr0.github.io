import java.util.Scanner;

public class Problem35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner keyboard = new Scanner(System.in);
		String number = Integer.toString(keyboard.nextInt());
		keyboard.close();
		for (int i = 1; i <= number.length(); i++)
			System.out.print(number.charAt(number.length() - i));
	}

}
