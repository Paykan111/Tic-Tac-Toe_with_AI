package tictactoe;

import java.util.Scanner;

public class Service {
    static void game(String[] players) {
        char[] lineArray = ("_________").toCharArray();
        final char dm = (char) 34;
        int switcher = 0;
        Scanner forGame = new Scanner(System.in);
        String letter = "X";
        printField(lineArray);
        while (true) {
            switch (players[switcher]) {
                case "user":
                    System.out.println("Enter the coordinates: ");
                    break;
                case "easy":
                    System.out.println("Making move level " + dm + "easy" + dm);
                    break;
                case "medium":
                    System.out.println("Making move level " + dm + "medium" + dm);
                    break;
                case "hard":
                    System.out.println("Making move level " + dm + "hard" + dm);
                    break;
            }
            String str = forGame.nextLine().replaceAll(" ", "");
            if (str.equals("exit")) System.exit(0);
            if (nextTurn(lineArray, str, letter)) printField(lineArray);  //otrisovka polia s novim hodom esli on bil
            if (checkField(lineArray, letter)) break;  // proverka na okonchanie igri
            letter = swipeLetter(letter);   //smena bykvi kajdii hod
            switcher = swipePlayer(switcher);  //dlya smeni igroka
        }
    }

    private static int swipePlayer(int switcher) {
        if (switcher == 0) return 1;
        else return 0;
    }

    private static String swipeLetter(String letter) {
        if (letter.equals("X")) return "O";
        else return "X";
    }

    private static boolean checkField(char[] lineArray, String letter) {
        if (
                (!String.valueOf(lineArray[0]).equals("_") && (lineArray[0] == lineArray[1] && lineArray[1] == lineArray[2])) ||
                        (!String.valueOf(lineArray[3]).equals("_") && (lineArray[3] == lineArray[4] && lineArray[4] == lineArray[5])) ||
                        (!String.valueOf(lineArray[6]).equals("_") && (lineArray[6] == lineArray[7] && lineArray[7] == lineArray[8])) ||
                        (!String.valueOf(lineArray[0]).equals("_") && (lineArray[0] == lineArray[3] && lineArray[3] == lineArray[6])) ||
                        (!String.valueOf(lineArray[1]).equals("_") && (lineArray[1] == lineArray[4] && lineArray[4] == lineArray[7])) ||
                        (!String.valueOf(lineArray[2]).equals("_") && (lineArray[2] == lineArray[5] && lineArray[5] == lineArray[8])) ||
                        (!String.valueOf(lineArray[0]).equals("_") && (lineArray[0] == lineArray[4] && lineArray[4] == lineArray[8])) ||
                        (!String.valueOf(lineArray[2]).equals("_") && (lineArray[2] == lineArray[4] && lineArray[4] == lineArray[6]))
        ) {
            if (letter.equals("X")) System.out.println("X wins");
            else System.out.println("O wins");
            System.out.println();
            return true;
        }
        int empty = 0;
        for (char c: lineArray){
            if (String.valueOf(c).equals(" ")) empty++;
        }
        if (empty == 0) {
            System.out.println("Draw");
            return true;
        }
        return false;
    }

    public static boolean nextTurn(char[] lineArray, String str, String letter) {
        if (isNumeric(str)) {
            switch (str) {
                case "11":
                    if (String.valueOf(lineArray[6]).equals("_")) {
                        lineArray[6] = letter.charAt(0);
                        return true;
                    } else System.out.println("This cell is occupied! Choose another one!");
                    break;
                case "12":
                    if (String.valueOf(lineArray[3]).equals("_")) {
                        lineArray[3] = letter.charAt(0);
                        return true;
                    } else System.out.println("This cell is occupied! Choose another one!");
                    break;
                case "13":
                    if (String.valueOf(lineArray[0]).equals("_")) {
                        lineArray[0] = letter.charAt(0);
                        return true;
                    } else System.out.println("This cell is occupied! Choose another one!");
                    break;
                case "21":
                    if (String.valueOf(lineArray[7]).equals("_")) {
                        lineArray[7] = letter.charAt(0);
                        return true;
                    } else System.out.println("This cell is occupied! Choose another one!");
                    break;
                case "22":
                    if (String.valueOf(lineArray[4]).equals("_")) {
                        lineArray[4] = letter.charAt(0);
                        return true;
                    } else System.out.println("This cell is occupied! Choose another one!");
                    break;
                case "23":
                    if (String.valueOf(lineArray[1]).equals("_")) {
                        lineArray[1] = letter.charAt(0);
                        return true;
                    } else System.out.println("This cell is occupied! Choose another one!");
                    break;
                case "31":
                    if (String.valueOf(lineArray[8]).equals("_")) {
                        lineArray[8] = letter.charAt(0);
                        return true;
                    } else System.out.println("This cell is occupied! Choose another one!");
                    break;
                case "32":
                    if (String.valueOf(lineArray[5]).equals("_")) {
                        lineArray[5] = letter.charAt(0);
                        return true;
                    } else System.out.println("This cell is occupied! Choose another one!");
                    break;
                case "33":
                    if (String.valueOf(lineArray[2]).equals("_")) {
                        lineArray[2] = letter.charAt(0);
                        return true;
                    } else System.out.println("This cell is occupied! Choose another one!");
                    break;
                default:
                    System.out.println("Coordinates should be from 1 to 3!");
                    break;
            }
        } else {
            System.out.println("You should enter numbers!");
        }
        return false;
    }

    private static boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?");  //match a number with optional '-' and decimal.
    }

    private static void printField(char[] lineArray) {
        String[][] array = new String[5][9];
        int count = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 9; j++) {
                if (i == 0 || i == 4) array[i][j] = "-";  //ramki sverhy
                else {
                    if (j == 0 || j == 8) array[i][j] = "|";   // ramki sboky
                    else {
                        if (j % 2 == 0) {
                            array[i][j] = String.valueOf(lineArray[count]);
                            count++;
                        } else {
                            array[i][j] = " ";
                        }
                    }
                }
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}
