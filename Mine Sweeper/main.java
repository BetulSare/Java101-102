
package minesweper;

import java.util.Scanner;

public class MineSweper {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        int columns = scanner.nextInt();

        MineSweeper game = new MineSweeper(rows, columns);
        game.play();
    }


}