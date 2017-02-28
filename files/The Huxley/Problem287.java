import java.util.Scanner;

public class Problem287 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		int[] g = {
			keyboard.nextInt(),
			keyboard.nextInt(),
			keyboard.nextInt(),
		};
		int[] c = {
			keyboard.nextInt(),
			keyboard.nextInt(),
			keyboard.nextInt(),
		};
		keyboard.close();
		if (c[0] <= g[0] && c[1] <= g[1] && c[2] <= g[2])
			System.out.println("SIM");
		else
			System.out.println("NAO");
	}

}
