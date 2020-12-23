import java.util.Locale;
import java.util.Scanner;

public class Uri1016 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int distance = scanner.nextInt();
        int time = 2 * distance;

        System.out.println(time + " minutos");

        scanner.close();

    }
}
