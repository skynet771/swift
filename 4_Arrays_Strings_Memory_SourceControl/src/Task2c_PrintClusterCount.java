/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Task2c_PrintClusterCount {
    public static void main(String[] args){
        int[] arr = {1, 1, 2, 3, 3, 5, 6, 7, 9, 9, 9, 9, 10, 10};
        int count = 0;
         for(int i = 0; i< arr.length; i++){
           if(i==0 && arr[i]==arr[i+1]){
               count++;
           }
           else if(i!=arr.length-1 && (arr[i]==arr[i+1]) && (arr[i]!=arr[i-1])){
                count++;
            }
        }
        System.out.println(count);
    }
}
