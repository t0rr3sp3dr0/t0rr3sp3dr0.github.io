import java.util.Scanner;


public class Problem75 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		int[] voo = new int[37];
		int[] vagas = new int[37];
		for (int i = 0; i < 37; i++) {
			voo[i] = keyboard.nextInt();
			vagas[i] = keyboard.nextInt();
		}
		while (true) {
			int id = keyboard.nextInt();
			if (id == 9999)
				break;
			int n = keyboard.nextInt();
			boolean b = false;
			for (int i = 0; i < 37; i++)
				if (voo[i] == n && vagas[i] > 0) {
					b = true;
					vagas[i]--;
					System.out.println(id);
				}
			if (!b)
				System.out.println("INDISPONIVEL");
		}
		keyboard.close();
	}

}
