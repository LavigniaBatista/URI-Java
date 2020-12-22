import java.util.Locale;
import java.util.Scanner;

public class Uri1002 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double radius, area;

        radius = scanner.nextDouble();

        area = 3.14159 * (radius*radius);

        System.out.printf("A=%.4f", area);
        System.out.println();

        scanner.close();
    }
}
