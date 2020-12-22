import java.util.Locale;
import java.util.Scanner;

public class Uri1010 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        double C = scanner.nextDouble();
        int D = scanner.nextInt();
        int E = scanner.nextInt();
        double F = scanner.nextDouble();
        double total = (double) B * C + E * F;

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);

        scanner.close();
    }
}
