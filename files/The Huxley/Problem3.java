import java.util.Scanner;


public class Problem3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		int out = 0;
		for (int i = keyboard.nextInt(); i > 0; i--)
			out += keyboard.nextInt();
		keyboard.close();
		System.out.println(out);
	}

}
