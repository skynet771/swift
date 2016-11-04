
import java.util.Calendar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Person {
    private String firstName;
    private String lastName;
    private char gender;
    private int yearOfBirth;
    private double weight;
    private double height;
    private String profession;
    private double gradesSum;
    private double grade01;
    private double grade02;
    private double grade03;
    private double grade04;
     
    
    Person(String firstName, String lastName, String gender, String yearOfBirth, String weight, String height, String profession, String grade01, String grade02, String grade03, String grade04){
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender.charAt(0);
        this.yearOfBirth = Integer.parseInt(yearOfBirth);
        this.weight = Double.parseDouble(weight);
        this.height = Double.parseDouble(height);
        this.profession = profession;
        this.grade01 = Double.parseDouble(grade01);
        this.grade02 = Double.parseDouble(grade02);
        this.grade03 = Double.parseDouble(grade03);
        this.grade04 = Double.parseDouble(grade04);
    }
     
    public void getInfo(){
        Calendar now = Calendar.getInstance();
        int currentYear = now.get(Calendar.YEAR);
        int age = currentYear - yearOfBirth;
        double gradesSum = grade01+grade02+grade03+grade04;
        double gradesAverage =  gradesSum/4;
         if(age >= 18 && gender=='M'){        
        System.out.printf("%s %s is %d years old.His weight is %.1f and he is %.1f cm tall.He is a %s with an average grade of %.3f"
                
                           ,firstName,lastName, age, weight, height, profession, gradesAverage);
        } else if (age < 18 && age > 0 && gender=='M' ){
            System.out.printf("%s %s is %d years old.His weight is %.1f and he is %.1f cm tall.He is a %s with an average grade of %..%s %s is under-aged"
                           ,firstName, lastName, age, weight, height, profession, gradesAverage, firstName, lastName);
             } else if (age >= 18 && gender=='F'){
                 System.out.printf("%s %s is %d years old.Her weight is %.1f and she is %.1f cm tall.She is a %s with an average grade of %.3f"
                         ,firstName,lastName, age, weight, height, profession, gradesAverage);
             } else if( age <18 && age > 0 && gender=='F'){
                 System.out.printf("%s %s is %d years old.Her weight is %.1f and she is %.1f cm tall.She is a %s with an average grade of %.3f.%s %s is under-aged"
                           ,firstName, lastName, age, weight, height, profession, gradesAverage, firstName, lastName);
             }
    }
}
