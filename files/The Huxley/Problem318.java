import java.util.Scanner;


public class Problem318 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		while (true) {
			int i = keyboard.nextInt();
			int j = keyboard.nextInt();
			if (i != 0 || j != 0)
				System.out.println(i + j);
			else
				break;
		}
		keyboard.close();
	}

}
