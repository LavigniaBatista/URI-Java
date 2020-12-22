import java.util.Locale;
import java.util.Scanner;

public class Uri1003 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int A, B, SOMA;

        A = scanner.nextInt();
        B = scanner.nextInt();

        SOMA = A + B;

        System.out.println("SOMA = " + SOMA);

        scanner.close();
    }
}
