import java.util.Scanner;


public class Problem256 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		int in = keyboard.nextInt();
		int[] a = new int[in];
		int[] b = new int[in];
		for (int i = 0; i < in; i++)
			a[i] = keyboard.nextInt();
		for (int i = 0; i < in; i++)
			b[i] = keyboard.nextInt();
		keyboard.close();
		for (int i = 0; i < in; i++) {
			System.out.println(a[i]);
			System.out.println(b[i]);
		}
	}

}
