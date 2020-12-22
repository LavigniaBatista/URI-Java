import java.util.Locale;
import java.util.Scanner;

public class Uri1005 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double n1 = scanner.nextDouble();
        double n2 = scanner.nextDouble();
        double MEDIA;

        MEDIA = (n1*3.5 + n2*7.5)/11;

        System.out.printf("MEDIA = %.5f\n", MEDIA);

        scanner.close();
    }
}
