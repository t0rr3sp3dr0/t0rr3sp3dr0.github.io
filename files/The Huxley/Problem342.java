import java.util.Scanner;


public class Problem342 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		int i = keyboard.nextInt();
		int c = 0;
		for (int j = 1; j <= i; j++)
			if (i % j == 0 && j % 3 == 0)
				c++;
		keyboard.close();
		if (c == 0)
			System.out.println("O numero nao possui divisores multiplos de 3!");
		else
			System.out.println(c);
	}

}
