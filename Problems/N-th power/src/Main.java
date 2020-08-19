import java.util.Scanner;

public class Main {

    public static double pow(double a, long n) {
        // write your code here
        if (n == 0) return 1;
        double b;
        if (n % 2 == 0) {
            b = pow(a, n / 2);
            return b * b;
        }
        return pow(a, n - 1) * a;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final double a = Double.parseDouble(scanner.nextLine());
        final int n = Integer.parseInt(scanner.nextLine());
        System.out.println(pow(a, n));
    }
}