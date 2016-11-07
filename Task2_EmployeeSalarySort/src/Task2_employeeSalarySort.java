
 
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
public class Task2_employeeSalarySort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Employee[] emp = new Employee[3];
        for (int i = 0; i < 3; i++) {
            String input = scan.nextLine();

            String[] words = input.split(",");
            String email = null;
            int age = 0;
            String name = words[0];
            double salary = Double.parseDouble(words[1]);
            String position = words[2];
            String department = words[3];
            if (words.length >= 5) {
                age = Integer.parseInt(words[4]);
            }
            if (words.length >= 6) {
                email = words[5];
            }

            Employee e = new Employee(name, salary, position, department, age, email);
            emp[i] = e;
        }

        Employee[] empSorted = new Employee[3];
        empSorted = doInsertionSort(emp);
        for (int i = empSorted.length - 1; i >= 0; i--) {
            System.out.println(empSorted[i].getInfo());
        }

    }

    public static Employee[] doInsertionSort(Employee[] input) {

        Employee temp;
        for (int i = 1; i < input.length; i++) {
            for (int j = i; j > 0; j--) {
                if (input[j].getSalary() < input[j - 1].getSalary()) {
                    temp = input[j];
                    input[j] = input[j - 1];
                    input[j - 1] = temp;
                }
            }
        }
        return input;
    }

}
