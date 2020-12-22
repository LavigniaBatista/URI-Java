import java.util.Locale;
import java.util.Scanner;

public class Uri1004 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double A, B, PROD;

        A = scanner.nextInt();
        B = scanner.nextInt();

        PROD = A * B;

        System.out.println("PROD = " + PROD);

        scanner.close();
    }
}
