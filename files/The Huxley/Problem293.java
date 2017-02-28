import java.util.Scanner;

public class Problem293 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner keyboard = new Scanner(System.in);
		int x = keyboard.nextInt();
		int y = keyboard.nextInt();
		int z = keyboard.nextInt();
		keyboard.close();
		System.out.println(greater(greater(x, y), z) + " eh o maior");
	}
	
	public static int greater(int i, int j) {
		return (i + j + Math.abs(i - j)) / 2;
	}

}
