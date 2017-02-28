import java.util.Scanner;

public class Problem47 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		while (true) {
			int i = keyboard.nextInt();
			if (i < 1000 || i > 9999)
				break;
			
			String s = Integer.toString(i);
			int x = Integer.parseInt(s.substring(0, 2));
			int y = Integer.parseInt(s.substring(2, 4));
			if (Math.pow(x + y, 2) == i)
				System.out.println("propriedade do 3025!");
			else
				System.out.println("numero comum");
		}
		keyboard.close();
	}

}
