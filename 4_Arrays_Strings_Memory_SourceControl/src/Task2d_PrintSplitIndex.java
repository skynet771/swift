/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Task2d_PrintSplitIndex {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,9,1};
        int sum1 = 0;
         int sum2 = 0;
          
         for(int s = 0; s<arr.length; s++){
             sum1 = 0;
             sum2 = 0;
            for(int y = s; y>=0;y--){
                 
                     sum1 += arr[y];
        }
            
            for(int i = s+1; i<= arr.length-1; i++){
                sum2 += arr[i];
            }
             if(sum1==sum2)
             System.out.println(s);
         }
         
         
    }
}
