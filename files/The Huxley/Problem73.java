import java.util.Scanner;

public class Problem73 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		int oldest = 0;
		int people = 0;
		int match = 0;
		while (true) {
			int age = keyboard.nextInt();
			if (age == -1)
				break;
			people++;
			if (age > oldest)
				oldest = age;
			char gender = keyboard.next().charAt(0);
			char hair = keyboard.next().charAt(0);
			char eyes = keyboard.next().charAt(0);
			if (age >= 18 && age <= 35 && gender == 'f' && hair == 'l' && eyes == 'v')
				match++;
		}
		keyboard.close();
		System.out.println("Mais velho: " + oldest);
		System.out.println(String.format("Mulheres com olhos verdes, loiras com 18 a 35 anos: %.2f%s", ((double) match / people) * 100, "%"));
	}

}
