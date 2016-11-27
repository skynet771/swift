
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Task2_CommonSubset {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       List<Integer> list1 = new ArrayList<Integer>();
       List<Integer> list2 = new ArrayList<Integer>();
       Scanner scan = new Scanner(System.in);
       int numOne = scan.nextInt();
       int numTwo = scan.nextInt();
       for(int i = 0; i<numOne;i++){
           list1.add(scan.nextInt());
       }
        for (int i = 0; i < numTwo; i++) {
            list2.add(scan.nextInt());
        }
       
       
        Set<Integer> commons = new HashSet();
        commons.addAll(list2);
        commons.retainAll(list1);
        if(commons.size()>0){
            for(Object o : commons){
                System.out.print(o.toString()+" ");
            }
        } else {
            System.out.println("NO");
        }
       
       
    }
   
}
