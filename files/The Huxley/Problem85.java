import java.util.Scanner;


public class Problem85 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		int loop = keyboard.nextInt();
		for (int i = 0; i < loop; i++) {
			int len = keyboard.nextInt();
			char[] c = Integer.toString(keyboard.nextInt()).toCharArray();
			while (true) {
				int e = 0;
				int b = 0;
				char[] in = Integer.toString(keyboard.nextInt()).toCharArray();
				if (in[0] == '0')
					break;
				char[] s = c.clone();
				for (int j = 0; j < len; j++)
					if (c[j] == in[j]) {
						e++;
						s[j] = 0;
						in[j] = 1;
					}
				for (int j = 0; j < len; j++)
					for (int k = 0; k < len; k++)
						if (s[j] == in[k] && j != k) {
							b++;
							s[j] = 0;
							in[k] = 1;
						}
				System.out.println("(" + e + "," + b + ")");
				if (e == len)
					break;
			}
		}
		keyboard.close();
	}

}