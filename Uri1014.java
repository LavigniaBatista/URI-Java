import java.util.Locale;
import java.util.Scanner;

public class Uri1014 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int X = scanner.nextInt();
        double Y = scanner.nextDouble();
        double M = X/Y;

        System.out.printf("%.3f km/l\n", M);

        scanner.close();


    }
}
