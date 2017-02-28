import java.text.NumberFormat;
import java.util.Scanner;

/**
 * Created by phts on 08/06/16.
 */
public class Problem787 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int meses = in.nextInt();

        double taxa = in.nextDouble();

        double valor = in.nextDouble();

        double resposta = calcularJuros(meses, taxa, valor);

        NumberFormat nf = NumberFormat.getNumberInstance();

        nf.setMaximumFractionDigits(2);

        nf.setMinimumFractionDigits(2);

        System.out.println(nf.format(resposta));
    }

    public static double calcularJuros(int meses, double taxa, double valor) {
        if (meses == 0)
            return valor;
        else
            return calcularJuros(--meses, taxa, valor) * (1 + taxa);
    }
}
