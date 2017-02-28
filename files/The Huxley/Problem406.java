import java.util.Scanner;

public class Problem406 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		int i = keyboard.nextInt();
		int j = keyboard.nextInt();
		keyboard.close();
		int x;
		int y;
		int e = 0;
		if (i > j) {
			x = j;
			y = i;
		} else {
			x = i;
			y = j;
		}
		for (; x <= y; x++)
			if (x > 0)
				e += x;
		System.out.println(e);
	}

}
