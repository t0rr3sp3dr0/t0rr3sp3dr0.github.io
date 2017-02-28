import java.util.Scanner;

/**
 * Created by pedro on 10/4/16.
 * © 2016 Singularity Systems
 */
public class Problem877 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int in = scanner.nextInt();

        if (in < 2 || in > 10)
            System.out.println("Entrada Invalida!");
        else
            for (int i = 0; i < in; i++) {
                if (i == 0 || i == in - 1) {
                    for (int j = 0; j < in; j++)
                        System.out.print('*');
                    System.out.println();
                } else {
                    for (int j = 0; j < in; j++) {
                        if (j == 0 || j == in - 1)
                            System.out.print('*');
                        else
                            System.out.print(' ');
                    }
                    System.out.println();
                }
            }
        System.out.print("FIM!");
    }
}
