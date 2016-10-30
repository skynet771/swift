
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
public class Task4_PersonCharacteristics {
    public static void main(String[] args){
        Calendar now = Calendar.getInstance();
        int currentYear = (short)now.get(Calendar.YEAR);
        Scanner scan = new Scanner(System.in);   
        int userInput = scan.nextInt();
        scan.nextLine();
         
        for(int i = 0 ; i < userInput;i++){ 
        int[] grades = new int[4];       
        String name = scan.nextLine();       
        String lastName = scan.nextLine();
        String genderInput = scan.nextLine();        
        while(!genderInput.equals("M") && !genderInput.equals("F")){
            System.out.println("Wrong format!Type M or F");
            genderInput = scan.nextLine();
        }
        char gender = genderInput.charAt(0);
        int yearOfBirth = scan.nextShort();
        int age = currentYear - yearOfBirth;
        double weight = scan.nextDouble();
        double height = scan.nextDouble();
        scan.nextLine();
        String profession = scan.nextLine();
        double gradesSum = 0;
        for(int x = 0; x<4;x++){
            grades[x] = scan.nextInt();
        }
        for(int s = 0; s<grades.length;s++){
            gradesSum += grades[s];
        }
         double gradesAverage = gradesSum/4;
          
        //Printing the information about the person.
        if(age >= 18 && gender=='M'){        
        System.out.printf("%s %s is %d years old.His weight is %.1f and he is %.1f cm tall.He is a %s with an average grade of %.3f"
                
                           ,name,lastName, age, weight, height, profession, gradesAverage);
        } else if (age < 18 && age > 0 && gender=='M' ){
            System.out.printf("%s %s is %d years old.His weight is %.1f and he is %.1f cm tall.He is a %s with an average grade of %..%s %s is under-aged"
                           ,name, lastName, age, weight, height, profession, gradesAverage, name, lastName);
             } else if (age >= 18 && gender=='F'){
                 System.out.printf("%s %s is %d years old.Her weight is %.1f and she is %.1f cm tall.She is a %s with an average grade of %.3f"
                         ,name,lastName, age, weight, height, profession, gradesAverage);
             } else if( age <18 && age > 0 && gender=='F'){
                 System.out.printf("%s %s is %d years old.Her weight is %.1f and she is %.1f cm tall.She is a %s with an average grade of %.3f.%s %s is under-aged"
                           ,name, lastName, age, weight, height, profession, gradesAverage, name, lastName);
             }
        }   
    }
}
