import java.util.Scanner;

/**
 * Created by pedro on 10/4/16.
 * © 2016 Singularity Systems
 */
public class Problem942 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int in = scanner.nextInt();
        double[][] out = new double[5][7];

        for (int i = 0; i < 5; i++)
            for (int j = 0; j < 7 && (i < 4 || scanner.hasNextDouble()); j++)
                out[i][j] = scanner.nextDouble();

        int count = 0;
        double sum = 0;
        double max = Double.MIN_VALUE;
        String maxDays = "";
        double min = Double.MAX_VALUE;
        String minDays = "";
        int now = 0;
        for (int i = 0; i < 5; i++)
            for (int j = 0; j < 7; j++) {
                now++;
                if (out[i][j] != 0)
                    count++;
                sum += out[i][j];
                if (out[i][j] == max)
                    maxDays += now + " ";
                if (out[i][j] > max) {
                    maxDays = now + " ";
                    max = out[i][j];
                }
                if (out[i][j] == min)
                    minDays += now + " ";
                if (out[i][j] < min && out[i][j] != 0) {
                    minDays = now + " ";
                    min = out[i][j];
                }
            }

        System.out.println(count);
        System.out.println(String.format("%.2f", sum / in).replace(".00", ".0"));
        System.out.println(String.format("%.2f", sum / count).replace(".00", ".0"));
        System.out.println(String.format("%.2f", max).replace(".00", ".0"));
        System.out.println(maxDays);
        System.out.println(String.format("%.2f", min).replace(".00", ".0"));
        System.out.println(minDays);
    }
}
