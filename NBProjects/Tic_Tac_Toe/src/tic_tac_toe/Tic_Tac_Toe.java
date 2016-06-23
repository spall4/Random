// Name : Pallav Shah   Date: 6/30/15   Title : Tic-Tac-Toe
// Description : Plays a Tic-Tac-Toe game one time and displays the result.

package tic_tac_toe;

import static java.lang.System.out;
import java.util.Scanner;

public class Tic_Tac_Toe {

    public static void main(String[] args) {
        char[][] a = new char[3][3];
        moveX(a);
        display(a);
        moveO(a);
        display(a);
        moveX(a);
        display(a);
        moveO(a);
        display(a);
        moveX(a);
        display(a);
        check(a);
        moveO(a);
        display(a);
        check(a);
        moveX(a);
        display(a);
        check(a);
        moveO(a);
        display(a);
        check(a);
        moveX(a);
        display(a);
        check(a);
        finalcheck(a);
    }

    public static void display(char[][] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a[i].length - 1; j++) {
                out.print(a[i][j] + " | ");
            }
            if (i == 0) {
                out.println(a[0][2]);
            }
            if (i == 1) {
                out.println(a[1][2]);
            }
            out.println("---------");
        }
        for (int i = 2; i < a.length; i++) {
            for (int j = 0; j < a[i].length - 1; j++) {
                out.print(a[i][j] + " | ");
            }
            out.println(a[2][2]);
        }
        System.out.println();
    }

    public static void moveX(char[][] a) {
        Scanner in = new Scanner(System.in);
        out.println("Player 1(\"X\"), enter your move: ");
        out.print("Row[0-2]: ");
        int row = in.nextInt();
        out.print("Column[0-2]: ");
        int col = in.nextInt();
        a[row][col] = 'X';
    }

    public static void moveO(char[][] a) {
        Scanner in = new Scanner(System.in);
        out.println("Player 2 (\"O\"), enter your move: ");
        out.print("Row: ");
        int row = in.nextInt();
        out.print("Column: ");
        int col = in.nextInt();
        a[row][col] = 'O';
    }

    public static void check(char[][] a) {
        boolean row0 = (a[0][0] == a[0][1]) && (a[0][1] == a[0][2]);
        boolean row1 = (a[1][0] == a[1][1]) && (a[1][1] == a[1][2]);
        boolean row2 = (a[2][0] == a[2][1]) && (a[2][1] == a[2][2]);
        boolean col0 = (a[0][0] == a[1][0]) && (a[1][0] == a[2][0]);
        boolean col1 = (a[0][1] == a[1][1]) && (a[1][1] == a[2][1]);
        boolean col2 = (a[0][2] == a[1][2]) && (a[1][2] == a[2][2]);
        boolean hyp1 = (a[0][0] == a[1][1]) && (a[1][1] == a[2][2]);
        boolean hyp2 = (a[2][0] == a[1][1]) && (a[1][1] == a[0][2]);
        if (row0 && a[0][0] != ' ') {
            printWinner(a[0][0]);
        } else if (col0 && a[0][0] != ' ') {
            printWinner(a[0][0]);
        } else if (row1 && a[0][0] != ' ') {
            printWinner(a[1][0]);
        } else if (col1 && a[1][1] != ' ') {
            printWinner(a[0][1]);
        } else if (row2 && a[2][2] != ' ') {
            printWinner(a[2][0]);
        } else if (col2 && a[2][2] != ' ') {
            printWinner(a[0][2]);
        } else if (hyp1 && a[1][1] != ' ') {
            printWinner(a[0][0]);
        } else if (hyp2 && a[1][1] != ' ') {
            printWinner(a[2][0]);
        }

    }

    public static void printWinner(char x) {
        if (x == 'X') {
            out.println("Player 1(\"X\") wins!");
        } else if (x == 'O') {
            out.println("Player 2 (\"O\") wins!");
        }
        System.exit(0);
    }

    public static void finalcheck(char[][] a) {
        if (a[0][0] != ' ' && a[0][1] != ' ' && a[0][2] != ' '
                && a[1][0] != ' ' && a[1][1] != ' ' && a[1][2] != ' '
                && a[2][0] != ' ' && a[2][1] != ' ' && a[2][2] != ' ') {
            System.out.println("It's a Draw game!");
            System.exit(0);
        }
    }

}
