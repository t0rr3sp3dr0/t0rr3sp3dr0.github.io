import java.util.Scanner;

public class Problem297 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner keyboardInput = new Scanner(System.in);
		int count = 0;
		int year0 = keyboardInput.nextInt();
		int year1 = keyboardInput.nextInt();
		keyboardInput.close();
		for (int year = year0; year <= year1; year++)
			if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
				count++;
				System.out.println(year);
			}
		if (count == 0)
			System.out.println(-1);
	}

}
