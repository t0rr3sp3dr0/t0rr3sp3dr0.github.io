import java.util.Scanner;


public class Problem180 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		int N = keyboard.nextInt();
		int C = keyboard.nextInt();
		int pessoas = 0;
		boolean max = false;
		for (int i = 0; i < N; i++) {
			pessoas -= keyboard.nextInt();
			pessoas += keyboard.nextInt();
			if (pessoas > C)
				max = true;
		}
		keyboard.close();
		if (max)
			System.out.println('S');
		else
			System.out.println('N');
	}

}
