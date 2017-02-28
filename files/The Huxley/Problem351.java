import java.util.Scanner;

public class Problem351 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.println(multiply(keyboard.nextInt(), keyboard.nextInt(), 0));
		keyboard.close();
	}
	
	public static int multiply(int i, int j, int k) {
		if (i == 0 || j == 0)
			return k;
		else if (j == 1)
			return k + i;
		else if (j < 0)
			return multiply(i, ++j, k -= i);
		return multiply(i, --j, k += i);
	}

}
