
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
public class Task3a_IsPalindrome {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        String str = scan.nextLine();
         
        int halfLength = str.length()/2;
         
        String str1 = str.substring(0,halfLength+1);
        String str2 = str.substring(halfLength);
         
        String reversed = new StringBuilder(str2).reverse().toString();
        if(str1.equals(reversed)){
            System.out.println(true);
        } else {
            System.out.println(false);
        }
       
    }
}
