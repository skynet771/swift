/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Test {
    public static void main(String[] args){
        double[] grades = {2,2,4,5};
        double gradesSum = 0;
        for(int i = 0 ; i <grades.length;i++){
            gradesSum += grades[i];
        }
        System.out.println(gradesSum);
    }
}
