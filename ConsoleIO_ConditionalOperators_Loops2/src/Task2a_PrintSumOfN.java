
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
public class Task2a_PrintSumOfN {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sum = 0;
        for(int i = 0; i<n;i++){
            sum += scan.nextInt();
        }
        System.out.println(sum);
    }   
}
