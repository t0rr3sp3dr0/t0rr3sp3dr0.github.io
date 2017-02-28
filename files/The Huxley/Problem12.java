import java.util.Scanner;


public class Problem12 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		int in = keyboard.nextInt();
		int[] led = new int[in];
		double[] price = new double[in];
		for (int i = 0; i < in; i++) {
			led[i] = keyboard.nextInt();
			keyboard.nextLine();
			keyboard.nextLine() ;
			price[i] = keyboard.nextDouble();
		}
		double out = 0;
		while (true) {
			int codigo = keyboard.nextInt();
			if (codigo == 0)
				break;
			int quantidade = keyboard.nextInt();
			if (quantidade < 0)
				continue;
			for (int i = 0; i < led.length; i++)
				if (led[i] == codigo) {
					out += price[i] * quantidade;
					break;
				}
		}
		keyboard.close();
		System.out.println(String.format("%.2f", out));
	}

}
