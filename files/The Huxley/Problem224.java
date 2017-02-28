import java.util.Scanner;


public class Problem224 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		int in = -1;
		int out = 0;
		do {
			in = keyboard.nextInt();
			if (in > out)
				out = in;
		} while(in != 0);
		keyboard.close();
		System.out.println(out);
	}

}
