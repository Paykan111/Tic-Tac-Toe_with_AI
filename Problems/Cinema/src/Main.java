import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int seats = scanner.nextInt();
        String[] ar = new String[rows + 1];
        for (int n = 0; n < rows + 1; n++) {
            ar[n] = scanner.nextLine().replaceAll("\\s+", "");
        }
        int k = scanner.nextInt();
        scanner.close();
        int count = 0;
        char[] charArray;
        for (int n = 0; n < rows + 1; n++) {
            charArray = ar[n].toCharArray();
            for (int m = 0; m < ar[n].length(); m++) {
                if (Character.getNumericValue(charArray[m])==0) count++;
                else count=0;
                if (count == k) {
                    System.out.println(n);
                    System.exit(0);
                }
            }
            count = 0;
        }
        System.out.println(0);
    }
}