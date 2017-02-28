import java.util.Scanner;

public class Problem378 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		int out = 0;
		for (int i = 0; i < 6; i++)
			out += keyboard.nextInt();
		keyboard.close();
		if (out >= 100)
			System.out.println("Classificado");
		else
			System.out.println("Eliminado");
	}

}
