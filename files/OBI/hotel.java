import java.util.Scanner;

/**
 * Created by phts on 03/06/16.
 */
public class hotel {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        boolean IA = keyboard.nextInt() == 1;
        boolean IB = keyboard.nextInt() == 1;
        boolean FA = keyboard.nextInt() == 1;
        boolean FB = keyboard.nextInt() == 1;

        int counter = 0;
        if (IB != FB) {
            counter++;
            IA = !IA;
            if (IA != FA)
                counter++;
        } else if (IA != FA)
            counter++;

        System.out.println(counter);
    }
}
