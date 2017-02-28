import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by phts on 03/06/16.
 */
public class chuva {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int N = keyboard.nextInt();
        List<Long> heights = new ArrayList<>();
        for (int i = 0; i < N; i++)
            heights.add(keyboard.nextLong());

        int sections = 0;
        long bound = heights.get(0);
        int counter = 0;
        for (int i = 1; i < N; i++) {
            counter++;
            long l = heights.get(i);
            if (l >= bound) {
                bound = l;
                if (counter > 1)
                    sections += counter - 1;
                counter = 0;
            }
        }

        counter = 0;
        bound = heights.get(N - 1);
        for (int i = N - 1; i >= 0; i--) {
            long l = heights.get(i);
            if (l >= bound) {
                bound = l;
                if (counter > 1) {
                    sections += counter - 1;
                    break;
                }
                counter = 0;
            }
            counter++;
        }

        System.out.println(sections);
    }
}
