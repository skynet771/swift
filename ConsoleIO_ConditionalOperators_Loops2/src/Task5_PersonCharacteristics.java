
import java.util.Calendar;
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
public class Task5_PersonCharacteristics {
    public static void main(String[] args){
        Calendar now = Calendar.getInstance();
        int currentYear = (short)now.get(Calendar.YEAR);
        Scanner scan = new Scanner(System.in);
        int userInput = scan.nextInt();
        for(int i = 0 ; i < userInput;i++){                              
        String name = scan.nextLine();
        String lastName = scan.nextLine();
        int yearOfBirth = scan.nextShort();
        int age = currentYear - yearOfBirth;
        double weight = scan.nextDouble();
        double height = scan.nextDouble();
        String profession = scan.nextLine();
        //Printing the information about the person.
        if(age >= 18){        
        System.out.printf("%s %s is %d years old.His weight is %.1f and he is %.1f cm tall.He is a %s"
                           ,name, age, weight, height, profession);
        } else if (age < 18 && age> 0){
            System.out.printf("%s is under-aged.His weight is %.1f and he is %.1f cm tall.He is a %s"
                           ,name, lastName, weight, height, profession);
             } 
        }
    }
}
