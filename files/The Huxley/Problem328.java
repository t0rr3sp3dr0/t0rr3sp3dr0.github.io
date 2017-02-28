import java.util.Scanner;

public class Problem328 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		int x = keyboard.nextInt();
		int y = keyboard.nextInt();
		keyboard.close();
		if (x > 0 && y > 0)
			System.out.println("primeiro");
		else if (x < 0 && y > 0)
			System.out.println("segundo");
		else if (x < 0 && y < 0)
			System.out.println("terceiro");
		else if (x > 0 && y < 0)
			System.out.println("quarto");
		else if (x != 0 && y == 0)
			System.out.println("eixo x");
		else if (x == 0 && y != 0)
			System.out.println("eixo y");
		else
			System.out.println("origem");
	}

}
