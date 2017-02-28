import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by phts on 03/06/16.
 */
public class avenida {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int N = keyboard.nextInt();
        int M = keyboard.nextInt();
        int[][] matrix = new int[N][M];
        for (int i = 0; i < N; i++)
            for (int j = 0; j < M; j++)
                matrix[i][j] = keyboard.nextInt();

        int[] values = new int[M];
        for (int i = 0; i < N; i++)
            for (int j = 0; j < M; j++)
                values[j] += matrix[i][j];

        Arrays.sort(values);

        System.out.println(values[0]);
    }
}
