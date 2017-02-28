import java.util.Scanner;

/**
 * Created by phts on 03/06/16.
 */
public class chaves {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String input = "";
        for (int i = keyboard.nextInt(); i > -1 ; i--)
            input += keyboard.nextLine();

        int counterI = 0;
        int counterJ = 0;
        for (char c : input.toCharArray()) {
            if (c == '{')
                counterI++;
            else if (c == '}')
                counterJ++;
        }

        System.out.println(counterI == counterJ ? "S" : "N");
    }
}
