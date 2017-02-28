import java.util.Scanner;

public class Problem174 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		int i = keyboard.nextInt();
		keyboard.close();
		int price = 7;
		while (i > 0) {
			if (i > 100)
				price += 5;
			else if (i > 30 && i <= 100)
				price += 2;
			else if (i > 10 && i <= 30)
				price += 1;
			i--;
		}
		System.out.println(price);
	}

}
