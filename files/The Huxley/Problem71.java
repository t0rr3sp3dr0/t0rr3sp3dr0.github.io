import java.util.Scanner;


public class Problem71 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		int[] produtos = new int[100];
		int[] estoque = new int[100];
		int count = 0;
		for (int i = 0; i < 100; i++) {
			int in = keyboard.nextInt();
			if (in == 9999)
				break;
			produtos[i] = in;
			estoque[i] = keyboard.nextInt();
			count++;
		}
		while (true) {
			int in = keyboard.nextInt();
			if (in == 9999)
				break;
			int codigo = keyboard.nextInt();
			int quantidade = keyboard.nextInt();
			for (int i = 0; i < count; i++) {
				if (produtos[i] == codigo) {
					if (estoque[i] >= quantidade) {
						estoque[i] -= quantidade;
						System.out.println("OK");
					} else
						System.out.println("ESTOQUE INSUFICIENTE");
					break;
				}
			}
		}
		keyboard.close();
		for (int i = 0; i < count; i++)
			System.out.println(produtos[i] + " " + estoque[i]);
	}

}
