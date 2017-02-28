import java.util.Scanner;


public class Problem25 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		int i = keyboard.nextInt();
		int j = keyboard.nextInt();
		keyboard.close();
		int e = i;
		if (i > j) {
			i = j;
			j = e;
			e = i;
		}
		do {
			if (Integer.toString(e).charAt(1) != '0' && e % Integer.parseInt(Character.toString(Integer.toString(e).charAt(0))) == 0)
				System.out.println(e);
			e++;
		} while (e <= j);
	}

}
