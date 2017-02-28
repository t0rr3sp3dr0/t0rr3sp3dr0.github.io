import java.util.Scanner;

/**
 * Created by pedro on 10/4/16.
 * © 2016 Singularity Systems
 */
public class Problem875 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = Integer.MIN_VALUE;
        int j = Integer.MIN_VALUE;

        for (int n = 0; n < 10; n++) {
            int in = scanner.nextInt();
            if (in > i) {
                j = i;
                i = in;
            } else if (in > j)
                j = in;
        }

        System.out.println(i);
        System.out.println(j);
    }
}
