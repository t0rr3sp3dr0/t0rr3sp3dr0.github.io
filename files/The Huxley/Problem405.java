import java.util.Scanner;

public class Problem405 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.println(ContaDigitosPares(keyboard.nextInt(), 0));
		keyboard.close();
	}
	
	public static int ContaDigitosPares(int i, int j) {
		if (i == 0)
			return j;
		if (i % 10 % 2 == 0)
			j++;
		return ContaDigitosPares(i /= 10, j);
	}

}
