import java.util.Scanner;

public class Problem691 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		int i = keyboard.nextInt();
		int j = keyboard.nextInt();
		keyboard.close();
		if (i > j)
			System.out.println(String.format("%d %d", j, i));
		else
			System.out.println(String.format("%d %d", i, j));
	}

}
