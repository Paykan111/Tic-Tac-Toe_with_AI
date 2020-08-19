import java.util.*;

public class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        // write your code here
        int n = scanner.nextInt();
        final int a = scanner.nextInt();
        final int b = scanner.nextInt();
        int result = 0;
        final Random random = new Random(a + b);
        for (int i = 0; i < n; i++) {
            result += random.nextInt(b - a + 1) + a;
        }
        System.out.println(result);
    }
}
