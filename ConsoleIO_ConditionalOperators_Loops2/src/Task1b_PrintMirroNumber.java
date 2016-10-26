
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
public class Task1b_PrintMirroNumber {
     public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        
        while (number > 0) {
        System.out.print( number % 10);
        number = number / 10;
        }
        /* Another way to do it. 
        String toString = new Integer(number).toString();
        String reversed = new StringBuilder(toString).reverse().toString();
        System.out.println(reversed);*/
    }
}
