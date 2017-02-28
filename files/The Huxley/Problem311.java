import java.util.Scanner;

public class Problem311 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		int a = keyboard.nextInt();
		int b = keyboard.nextInt();
		int c = keyboard.nextInt();
		int d = keyboard.nextInt();
		keyboard.close();
		if (b > c && d > a && c + d > a + b && c > 0 && d > 0 && a % 2 == 0)
			System.out.println("Valores aceitos");
		else
			System.out.println("Valores nao aceitos");

	}

}
