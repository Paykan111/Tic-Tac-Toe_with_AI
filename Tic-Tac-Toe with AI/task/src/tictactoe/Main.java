package tictactoe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner forMain = new Scanner(System.in);
        String[] players = new String[2];
        while (true) {
            System.out.print("Input command: ");
            String[] commands = forMain.nextLine().split(" ");
            if (commands[0].equals("exit")) {
                System.exit(0);
            }
            if (commands[0].equals("start")) {
                for (int i = 1; i < 3; i++) {
                    switch (commands[i]) {
                        case "user":
                            players[i - 1] = "user";
                            break;
                        case "easy":
                            players[i - 1] = "easy";
                            break;
                        case "medium":
                            players[i - 1] = "medium";
                            break;
                        case "hard":
                            players[i - 1] = "hard";
                            break;
                        default:
                            System.out.println("Bad parameters!");
                            break;
                    }
                }
                Service.game(players);
            } else System.out.println("Bad parameters!");
        }
    }
}