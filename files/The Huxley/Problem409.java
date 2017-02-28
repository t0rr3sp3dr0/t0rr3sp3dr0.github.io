import java.util.Scanner;

public class Problem409 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.println(SerieMiguelito(keyboard.nextInt(), 3, 4, 1));
		keyboard.close();
	}

	public static int SerieMiguelito(int x, int y, int z, int w) {
		if (w == x)
			return y;
		if (z == 4)
			return SerieMiguelito(x, y += 4, 1, ++w);
		return SerieMiguelito(x, y += 1, 4, ++w);
	}
	
}
