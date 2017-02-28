import java.util.Scanner;

public class Problem768 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		int[] x = new int[keyboard.nextInt()];
		for (int i = 0; i < x.length; i++)
			x[i] = keyboard.nextInt();
		int[] y = new int[keyboard.nextInt()];
		for (int i = 0; i < y.length; i++)
			y[i] = keyboard.nextInt();
		int[] z = new int[(x.length > y.length ? x.length : y.length) + 1];
		for (int i = 0; i < x.length; i++)
			z[z.length - i - 1] = x[x.length - i - 1];
		for (int i = 0; i < y.length; i++)
			z[z.length - i - 1] += y[y.length - i - 1];
		for (int i = 1; i < z.length - 1; i++)
			if (z[z.length - i] / 10 != 0) {
				z[z.length - i - 1] += z[z.length - i] / 10;
				z[z.length - i] = z[z.length - i] % 10;
			}
		boolean print = false;
		for (int i = 0; i < z.length; i++) {
			if (z[i] != 0 && !print)
				print = true;
			if (print)
				System.out.print(z[i]);
		}
		System.out.println();
	}

}
