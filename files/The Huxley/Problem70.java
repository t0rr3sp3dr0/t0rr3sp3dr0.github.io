import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Scanner;


public class Problem70 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		while (true) {
			int x = keyboard.nextInt();
			int n = keyboard.nextInt() - 1;
			if (x == 0 && n == -1)
				break;
			BigDecimal s;
			if (n >= 0)
				s = BigDecimal.valueOf(x);
			else
				s = BigDecimal.ZERO;
			int j = 3;
			boolean sign = false;
			for (int i = 0; i < n; i++) {
				try {
					BigDecimal num = BigDecimal.valueOf(x).pow((i + 1) * 2);
					BigDecimal den = fat(BigDecimal.valueOf(j));
					BigDecimal v = num.divide(den, MathContext.DECIMAL128);
					if (sign)
						s = s.add(v, MathContext.DECIMAL128);
					else
						s = s.subtract(v, MathContext.DECIMAL128);
					j += 2;
					sign = !sign;
				}
				catch (Exception e) {
					break;
				}
			}
			System.out.println(String.format("%.6f", s));
		}
		keyboard.close();
	}
	
	public static BigDecimal fat(BigDecimal n) {
		if (n.equals(BigDecimal.ZERO))
			return BigDecimal.ONE;
		else
			return n.multiply(fat(n.subtract(BigDecimal.ONE)));
	}
}
