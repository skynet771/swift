
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
public class Task4_PersonCharacteristics {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int userInput2 = scan.nextInt();
        scan.nextLine();
         
    String[] arr;
    for(int i = 0 ; i<userInput2;i++){
        String userInput = scan.nextLine();
        
        arr = userInput.split(","); 
        Person p1 = new Person(arr[0],arr[1],arr[2],arr[3],arr[4],arr[5],arr[6],arr[7],arr[8],arr[9],arr[10]);
        p1.getInfo();
    }
     
     
        
    }
     
    
}
