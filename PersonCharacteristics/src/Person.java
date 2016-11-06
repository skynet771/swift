
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
    private String _firstName;
    private String _lastName;
    private char _gender;
    private int _yearOfBirth;
    private double _weight;
    private double _height;
    private String _profession;
    private double _gradesSum;
  
     
    
    Person(String firstName, String lastName, char gender, int yearOfBirth, double weight, double height, String profession, double[] grades){
        this._firstName = firstName;
        this._lastName = lastName;
        this._gender = gender;
        this._yearOfBirth = yearOfBirth;
        this._weight = weight;
        this._height = height;
        this._profession = profession;
        this._gradesSum = sumGrades(grades);
        
    }
    
     
    public void getInfo(){
        Calendar now = Calendar.getInstance();
        int currentYear = now.get(Calendar.YEAR);
        int age = currentYear - _yearOfBirth;
         
        double gradesAverage =  _gradesSum/4;
         if(age >= 18 && _gender=='M'){        
        System.out.printf("%s %s is %d years old.His weight is %.1f and he is %.1f cm tall.He is a %s with an average grade of %.3f"
                
                           ,_firstName,_lastName, age, _weight, _height, _profession, gradesAverage);
        } else if (age < 18 && age > 0 && _gender=='M' ){
            System.out.printf("%s %s is %d years old.His weight is %.1f and he is %.1f cm tall.He is a %s with an average grade of %..%s %s is under-aged"
                           ,_firstName, _lastName, age, _weight, _height, _profession, gradesAverage, _firstName, _lastName);
             } else if (age >= 18 && _gender=='F'){
                 System.out.printf("%s %s is %d years old.Her weight is %.1f and she is %.1f cm tall.She is a %s with an average grade of %.3f"
                         ,_firstName,_lastName, age, _weight, _height, _profession, gradesAverage);
             } else if( age <18 && age > 0 && _gender=='F'){
                 System.out.printf("%s %s is %d years old.Her weight is %.1f and she is %.1f cm tall.She is a %s with an average grade of %.3f.%s %s is under-aged"
                           ,_firstName, _lastName, age, _weight, _height, _profession, gradesAverage, _firstName, _lastName);
             }
    }
     private static double sumGrades(double[] grades){
        double gradesSum = 0;
        for(int i = 0; i<grades.length;i++){
            gradesSum += grades[0];
        }
        return gradesSum;
    }
}
