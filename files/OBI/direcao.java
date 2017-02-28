import java.util.Scanner;

/**
 * Created by phts on 03/06/16.
 */
public class direcao {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println(Math.abs(Compass.valueOf(keyboard.next()).getDegrees() - Compass.valueOf(keyboard.next()).getDegrees()));
    }

    public enum Compass {
        norte (90),
        sul (270),
        leste (0),
        oeste (180);

        int degrees;
        Compass(int degrees) {
            this.degrees = degrees;
        }

        public int getDegrees() {
            return degrees;
        }
    }
}
