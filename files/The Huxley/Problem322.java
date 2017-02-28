import java.util.Scanner;


public class Problem322 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		int in = keyboard.nextInt();
		int[] numbers = new int[in];
		for (int i = 0; i < in; i++)
			numbers[i] = keyboard.nextInt();
		keyboard.close();
		int menor = 1000;
		int index = -1;
		for (int i = 0; i < in; i++)
			if (numbers[i] < menor) {
				menor = numbers[i];
				index = i;
			}
		System.out.println("Menor valor: " + menor);
		System.out.println("Posicao: " + index);
	}

}
