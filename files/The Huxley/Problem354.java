import java.util.Scanner;

public class Problem354 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		odd(keyboard.nextInt(), 0);
		keyboard.close();
	}
	
	public static void odd(int i, int j) {
		if (j <= i) {
			System.out.println(j);
			odd(i, j += 2);
		}
	}

}
