
import java.util.Arrays;
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
public class Task2b_PrintSortedNumbers {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int numbers = scan.nextInt();
        int[] arr = new int[numbers];
        for(int i =0;i<numbers;i++){
            arr[i] = scan.nextInt();
        } 
        //Arrays.sort(arr);
         
      //  }
        /*Anorther way to do it, with insertion sort
        for(int i = 1; i<arr.length;i++){
            int var = arr[i];
            int y = i;
           while(y>0 && arr[y-1] > var){
               arr[y] = arr[y-1];
               y--;
           } arr[y] = var;
        }*/
        for(int s : arr){
            System.out.print(s+" ");
        }
    }    
}
