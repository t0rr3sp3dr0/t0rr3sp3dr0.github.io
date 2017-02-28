import java.util.Scanner;


public class Problem260 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		int in = 0;
		do {
			in = keyboard.nextInt();
			if (in == -1)
				break;
			int sqrt = (int) Math.sqrt(in);
			boolean primo = true;
			if (in == 0 || in == 1) {
				System.out.println(0);
				continue;
			}
			for (int i = 2; i <= sqrt; i++)
				if (in % i == 0)
					primo = false;
			if (primo)
				System.out.println(1);
			else
				System.out.println(0);
		} while(true);
		keyboard.close();
	}

}
