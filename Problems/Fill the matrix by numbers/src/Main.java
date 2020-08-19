import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        scanner.close();
        int[][] arr = new int[size][size];
        int current;
        for (int i = 0; i < size; i++) {
            current = i;
            for (int j = 0; j < size; j++) {
                if (i == j) {
                    arr[i][j] = 0;
                    current=0;
                }
                if (j == 0) current = i;
                arr[i][j] = current;
                if (j<i) current--;
                else current++;
            }
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}