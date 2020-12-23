import java.util.Locale;
import java.util.Scanner;

public class Uri1015 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        double distance = Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));

        System.out.printf("%.4f\n", distance);

        scanner.close();
    }
}
