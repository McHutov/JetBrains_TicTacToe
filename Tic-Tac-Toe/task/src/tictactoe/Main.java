package tictactoe;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        char[][] chars = new char[3][3];
        int l = 0;

        for (char[] c: chars) {
            Arrays.fill(c,' ');
        }

        System.out.println("---------");
        System.out.println("| " + chars[0][0] + " " + chars[0][1] + " " + chars[0][2] + " |");
        System.out.println("| " + chars[1][0] + " " + chars[1][1] + " " + chars[1][2] + " |");
        System.out.println("| " + chars[2][0] + " " + chars[2][1] + " " + chars[2][2] + " |");
        System.out.println("---------");

        boolean exit = true;

        for(int k = 0; k < 9; k++) {
            do {
                System.out.print("Enter the coordinates: ");
                String coordinates = s.nextLine();
                if (coordinates.matches("\\d \\d")) {
                    int i = Integer.parseInt(String.valueOf(coordinates.charAt(0)));
                    int j = Integer.parseInt(String.valueOf(coordinates.charAt(2)));

                    if (i > 0 && i < 4 && j > 0 && j < 4) {
                        if (chars[2 - (j - 1)][i - 1] == ' ') {
                            if (k % 2 == 0) {
                                chars[2 - (j - 1)][i - 1] = 'X';
                                exit = false;
                            } else {
                                chars[2 - (j - 1)][i - 1] = 'O';
                                exit = false;
                            }
                        } else {
                            System.out.println("This cell is occupied! Choose another one!");
                        }
                    } else {
                        System.out.println("Coordinates should be from 1 to 3!");
                    }
                } else {
                    System.out.println("You should enter numbers!");
                }
            } while (exit);
            System.out.println("---------");
            System.out.println("| " + chars[0][0] + " " + chars[0][1] + " " + chars[0][2] + " |");
            System.out.println("| " + chars[1][0] + " " + chars[1][1] + " " + chars[1][2] + " |");
            System.out.println("| " + chars[2][0] + " " + chars[2][1] + " " + chars[2][2] + " |");
            System.out.println("---------");

            exit = true;

                int sum1 = 0;
                int sum2 = 0;
                int sum3 = 0;
                int sum4 = 0;
                int flagX = 0;
                int flagO = 0;
                int countX = 0;
                int countO = 0;
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        sum1 += chars[i][j];
                        sum2 += chars[j][i];
                        if (sum1 == 264 || sum2 == 264) {
                            flagX = 1;
                        }
                        if (sum1 == 237 || sum2 == 237) {
                            flagO = 2;
                        }
                        if (chars[i][j] == 'X') {
                            countX++;
                        }
                        if (chars[i][j] == 'O') {
                            countO++;
                        }
                    }
                    sum1 = 0;
                    sum2 = 0;
                    sum3 += chars[i][i];
                    sum4 += chars[i][2 - i];

                    if (sum3 == 264 || sum4 == 264) {
                        flagX = 1;
                    }
                    if (sum3 == 237 || sum4 == 237) {
                        flagO = 2;
                    }
                }

                if(k > 5) {
                    if (flagO - flagX == 1 || (Math.max(countO, countX) / Math.min(countO, countX)) >= 2) {
                        System.out.println("Impossible");
                        System.exit(0);
                    } else {
                        if (flagO - flagX == 2) {
                            System.out.println("O wins");
                            System.exit(0);
                        } else {
                            if (flagO - flagX == -1) {
                                System.out.println("X wins");
                                System.exit(0);
                            }
                        }
                    }
                    int index = 0;
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            if (chars[i][j] != '_') {
                                index++;
                            }
                        }
                    }

                    if (index == 9) {
                        System.out.println("Draw");
                    } else {
                        System.out.println("Game not finished");
                    }
                }
            }
        }

}
