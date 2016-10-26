/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Task1e_IsPrime {
     public static void main(String[] args){
        int number = 12;
         boolean isPrime = true;
         for(int i=2;2*i<number;i++) {
         if(number%i==0){
            isPrime = false;
            }
             
        }
        System.out.println(isPrime);
    }
}
