
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Task3b_PrintZFigure {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
         for (int row = 0; row < n; row++) {
            for (int column = 0; column < n; column++) {
            if (row == 0 || row == n - 1 || column == n - 1 - row) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();
        }
    }
}
