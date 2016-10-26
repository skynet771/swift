
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
public class Task1c_PrintSumOfDigits {
     public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int sum = 0;
        while (number > 0) {
        sum = sum+( number % 10);
        number = number / 10;
        }
        System.out.print(sum);
    }
}
