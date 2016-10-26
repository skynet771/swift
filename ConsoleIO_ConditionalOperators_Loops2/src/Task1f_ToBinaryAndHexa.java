/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Task1f_ToBinaryAndHexa {
    //Изкарва само числата в бинарна система.
     public static void main(String[] args){
        int number = 12;
        String bin = "";
         
        for(int i = number;i>0;i=i/2){
            if(i%2==0){
                bin += "0";
                
            } else {
                bin += "1";
            }
        }
        String binary = new StringBuilder(bin).reverse().toString();
        System.out.println(binary);
    }
}
