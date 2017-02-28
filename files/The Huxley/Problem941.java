import java.util.Scanner;

/**
 * Created by pedro on 10/4/16.
 * © 2016 Singularity Systems
 */
public class Problem941 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int in = scanner.nextInt();
        int[] out = new int[in];

        for (int i = 0; i < out.length; i++)
            out[i] = scanner.nextInt();

        for (int i = 0; i < out.length; i++) {
            if (out[i] % 2 == 0)
                out[i] = 1;
            else
                out[i] = -1;
        }

        int sum = 0;
        for (int i : out)
            sum += i;

        System.out.println(sum);
    }
}
