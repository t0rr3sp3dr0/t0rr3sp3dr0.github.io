import java.util.Scanner;

public class Problem552 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		int in = keyboard.nextInt();
		for (int i = 0; i < in; i++) {
			int d = keyboard.nextInt();
			int q = keyboard.nextInt();
			System.out.println(String.format("MDC(%d,%d) = %d", d, q, mdc(d, q)));
		}
		keyboard.close();
	}
	
	public static int mdc(int d, int q) {
		int e = d;
		if (d > q) {
			d = q;
			q = e;
		}
		int mod = q % d;
		if (mod == 0)
			return d;
		return mdc(d, mod);
	}

}
