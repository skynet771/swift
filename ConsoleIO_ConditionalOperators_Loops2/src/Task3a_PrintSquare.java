
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
public class Task3a_PrintSquare {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int userInput = scan.nextInt();
        for(int i = 0; i<userInput;i++){
            System.out.print("*");
        }
        System.out.println();
         for(int i = 0; i<userInput-2;i++){
            System.out.print("*");
            for(int y=0;y<userInput-2;y++){
                System.out.print(" ");
            }
             System.out.println("*");
        }
        for(int i = 0; i<userInput;i++){
            System.out.print("*");
        }
        System.out.println();
         
    
      
    }
}
