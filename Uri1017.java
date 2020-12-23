import java.util.Locale;
import java.util.Scanner;

public class Uri1017 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int time = scanner.nextInt();
        int speed = scanner.nextInt();
        double spentFuel = (double) speed * time / 12;

        System.out.printf("%.3f\n", spentFuel);

        scanner.close();

    }
}
