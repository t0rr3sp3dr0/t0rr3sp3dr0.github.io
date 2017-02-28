import java.util.Scanner;


public class Problem324 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		int i = 0;
		int j = 0;
		do {
			int in = keyboard.nextInt();
			if (in < 0)
				break;
			i += in;
			j++;
		} while (true);
		keyboard.close();
		System.out.println(String.format("%.2f", (float) i / j));
	}

}
