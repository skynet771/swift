
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
        String firstName = arr[0];
        String lastName = arr[1];
        char gender = arr[2].charAt(0);
        int yearOfBirth = Integer.parseInt(arr[3]);
        double weight = Double.parseDouble(arr[4]);
        double height = Double.parseDouble(arr[4]);
        String profession = arr[5];
        double[] grades = new double[4];
        grades[0] = Double.parseDouble(arr[6]);
        grades[1] = Double.parseDouble(arr[7]);
        grades[2] = Double.parseDouble(arr[8]);
        grades[3] = Double.parseDouble(arr[9]);
         
        Person p1 = new Person(firstName, lastName, gender, yearOfBirth, weight, height, profession, grades);
        p1.getInfo();
    }
     
     
        
    }
     
    
}
