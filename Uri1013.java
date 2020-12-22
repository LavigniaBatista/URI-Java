import java.util.Locale;
import java.util.Scanner;

public class Uri1013 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int AB = (A + B + Math.abs(A-B))/2;
        int bigger = (AB + C + Math.abs(AB-C))/2;

        System.out.println(bigger + " eh o maior\n");

        scanner.close();

    }
}
