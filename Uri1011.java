import java.util.Locale;
import java.util.Scanner;

public class Uri1011 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double radius = scanner.nextInt();
        double volume = (4.0/3) * 3.14159 * Math.pow(radius, 3);

        System.out.printf("VOLUME = %.3f\n", volume);

        scanner.close();

    }
}
