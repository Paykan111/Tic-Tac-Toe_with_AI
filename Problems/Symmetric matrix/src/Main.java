import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[][] array = new int[size][size];
        String usless = scanner.nextLine();
        int halfSize = ((size * size - size) / 2);
        for (int n = 0; n < size; n++) {
            char[] charArray = scanner.nextLine().replaceAll("\\s+", "").toCharArray();
            for (int m = 0; m < charArray.length; m++) {
                array[n][m] = Character.getNumericValue(charArray[m]);
//                System.out.println(array[n][m]);
            }
        }
        scanner.close();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (array[i][j]!=array[j][i]) {
                    System.out.println("NO");
                    System.exit(0);
                }
            }
        }
        System.out.println("YES");
    }
}