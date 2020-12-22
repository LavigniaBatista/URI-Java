import java.util.Locale;
import java.util.Scanner;

public class Uri1009 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        String name = scanner.next();
        double salary = scanner.nextDouble();
        double sales = scanner.nextDouble();
        double total;

        total = salary + sales * 0.15;

        System.out.printf("TOTAL = R$ %.2f\n", total);

        scanner.close();
    }
}
