import java.util.Arrays;
import java.util.Scanner;

public class Problem218 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		int[] b = {
			keyboard.nextInt(),
			keyboard.nextInt(),
			keyboard.nextInt(),
		};
		int[] d = {
			keyboard.nextInt(),
			keyboard.nextInt(),
		};
		keyboard.close();
		Arrays.sort(b);
		Arrays.sort(d);
		if (b[0] <= d[0] && b[1] <= d[1])
			System.out.println("S");
		else
			System.out.println("N");
	}

}
