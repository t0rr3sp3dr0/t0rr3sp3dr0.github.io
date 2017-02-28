import java.util.Scanner;


public class Problem334 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		int x = keyboard.nextInt();
		int z = -1;
		do {
			z = keyboard.nextInt();
		} while (x >= z);
		keyboard.close();
		int c = 1;
		for (int i = x; i <= z; c++)
			i += ++x;
		System.out.println(c);
	}

}
