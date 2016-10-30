
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
public class Task1а_PrintMatrix {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        int[][] arr = new int[input][input];
        int s = 1;
        for(int row=0;row <arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                arr[row][col] = s;
                s++;
            }
        }
        for(int row=0;row<arr.length;row++){
            for(int col = 0;col<arr[row].length;col++){
                System.out.print(arr[col][row]+" ");
            }
            System.out.println();
        }
        
    }
}
