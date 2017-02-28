import java.util.Scanner;

public class Problem433 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner keyboard = new Scanner(System.in);
		float ipva = keyboard.nextFloat();
		float taxa = keyboard.nextFloat();
		keyboard.close();
		System.out.println(String.format("%.2f", (ipva * 0.95) + taxa));
	}

}
