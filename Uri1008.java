import java.util.Locale;
import java.util.Scanner;

public class Uri1008 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int hours = scanner.nextInt();
        double value = scanner.nextDouble();
        double salary;

        salary = (double) hours * value;

        System.out.println("NUMBER = " + number);
        System.out.printf("SALARY = U$ %.2f\n", salary);

        scanner.close();


    }
}
