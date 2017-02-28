import java.util.Scanner;

/**
 * Created by pedro on 5/25/16.
 */
public class Problem579 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String[] in = keyboard.nextLine().split(" ");
        int[] A = new int[in.length];
        for (int i = 0; i < in.length; i++)
            A[i] = Integer.parseInt(in[i]);
        keyboard.close();

        System.out.print("Estado inicial: ");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i]);
            if (i < A.length - 1)
                System.out.print(" | ");
        }
        System.out.println("\n");

        quicksort(A, 0, A.length);

        System.out.print("Resultado Final: ");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i]);
            if (i < A.length - 1)
                System.out.print(" | ");
        }
        System.out.println("\n");
    }

    public static void quicksort(int[] A, int p, int r) {
        if (p + 1 < r) {
            int q = partition(A, p, r);

            System.out.println("Pivot: " + A[q]);
            System.out.print("Partition(A," + (p + 1) + "," + r + "): ");
            for (int i = p; i < r; i++) {
                if (i == q)
                    System.out.print("<= " + A[i] + " <");
                else
                    System.out.print(A[i]);
                if (i < r - 1)
                    System.out.print(" ");
            }
            System.out.print("\nEstado atual de A: ");
            for (int i = 0; i < A.length; i++) {
                System.out.print(A[i]);
                if (i < A.length - 1)
                    System.out.print(" | ");
            }
            System.out.println("\n");

            quicksort(A, p, q);
            quicksort(A, q + 1, r);
        }
    }

    public static int partition(int[] A, int p, int r) {
        int x = A[r - 1];
        int i = p - 1;
        for (int j = p; j < r - 1; j++) {
            if (A[j] <= x) {
                i = i + 1;
                int k = A[i];
                A[i] = A[j];
                A[j] = k;
            }
        }
        int j = A[i + 1];
        A[i + 1] = A[r - 1];
        A[r - 1] = j;
        return i + 1;
    }
}
