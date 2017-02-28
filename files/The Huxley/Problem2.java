import java.util.Arrays;
import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner keyboard = new Scanner(System.in);
		int[] numbers = {
				keyboard.nextInt(),
				keyboard.nextInt(),
				keyboard.nextInt(),
		};
		keyboard.close();
		Arrays.sort(numbers);
		for (int e : numbers)
			System.out.println(e);
	}

}
