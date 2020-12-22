import java.util.Locale;
import java.util.Scanner;

public class Uri1006 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double C = scanner.nextDouble();
        double MEDIA;

        MEDIA = (A*2 + B*3 + C*5)/10;

        System.out.printf("MEDIA = %.1f\n", MEDIA);

        scanner.close();
    }
}
