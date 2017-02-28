import java.util.Scanner;

public class Problem307 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner keyboard = new Scanner(System.in);
		float i = keyboard.nextFloat();
		keyboard.close();
		int j;
		
		System.out.println("NOTAS:");
		j = (int) (i / 100);
		System.out.println(j + " nota(s) de R$ 100.00");
		i = i % 100;
		j = (int) (i / 50);
		System.out.println(j + " nota(s) de R$ 50.00");
		i = i % 50;
		j = (int) (i / 20);
		System.out.println(j + " nota(s) de R$ 20.00");
		i = i % 20;
		j = (int) (i / 10);
		System.out.println(j + " nota(s) de R$ 10.00");
		i = i % 10;
		j = (int) (i / 5);
		System.out.println(j + " nota(s) de R$ 5.00");
		i = i % 5;
		j = (int) (i / 2);
		System.out.println(j + " nota(s) de R$ 2.00");
		i = i % 2;
		i = i * 100;
		i = Math.round(i);
		System.out.println("MOEDAS:");
		j = (int) (i / 100);
		System.out.println(j + " moeda(s) de R$ 1.00");
		i = (int) (i % 100);
		j = (int) (i / 50);
		System.out.println(j + " moeda(s) de R$ 0.50");
		i = (int) (i % 50);
		j = (int) (i / 25);
		System.out.println(j + " moeda(s) de R$ 0.25");
		i = (int) (i % 25);
		j = (int) (i / 10);
		System.out.println(j + " moeda(s) de R$ 0.10");
		i = (int) (i % 10);
		j = (int) (i / 5);
		System.out.println(j + " moeda(s) de R$ 0.05");
		i = (int) (i % 5);
		j = (int) (i / 1);
		System.out.println(j + " moeda(s) de R$ 0.01");
	}

}
