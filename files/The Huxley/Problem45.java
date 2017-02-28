import java.util.Scanner;

public class Problem45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		int x = keyboard.nextInt();
		int y = keyboard.nextInt();
		keyboard.close();
		String s = x >= 12 ? "pm" : "am";
		x = x >= 12 ? x - 12 : x;
		System.out.println(String.format("%02d", x).replace("00", "12"));
		System.out.println(String.format("%02d", y));
		System.out.println(s);
	}

}
