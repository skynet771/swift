
 
import java.util.Scanner;
import java.util.Arrays;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Task2a_PrintLargestNumber {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int numbers = scan.nextInt();
        int[] arr = new int[numbers];
        for(int i =0;i<numbers;i++){
            arr[i] = scan.nextInt();
        }
       Arrays.sort(arr);
       System.out.println(arr[arr.length-1]);
        
        
    }
}
