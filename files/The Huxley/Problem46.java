import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Problem46 {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		String x = keyboard.nextLine();
		String y = keyboard.nextLine();
		keyboard.close();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date xD = simpleDateFormat.parse(x);
		Date yD = simpleDateFormat.parse(y);
		long diffTime = yD.getTime() - xD.getTime();
		long diffDays = (diffTime / (1000 * 60 * 60 * 24));
		System.out.println(diffDays);
	}

}
