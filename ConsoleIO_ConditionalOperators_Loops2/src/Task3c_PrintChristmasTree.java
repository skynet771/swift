
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
public class Task3c_PrintChristmasTree {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int stars = 0;
       for (int i = 0; i < n-2; i++)
        {
            stars = i;
            for (int j = n-2; j > i; j--)
            {
                System.out.print(" ");
            }
            for (int k = 1; k <= i + 1; k++) {
                System.out.print(" *");
                
            }
            System.out.printf("%n");            
        }
       for(int i = 0; i< stars+2;i++){
           System.out.print(" ");
       }
       
       
       System.out.printf("*%n");
        for(int i = 0; i< stars+1;i++){
           System.out.print(" ");
       }
       System.out.print("***");
        
    }
}
