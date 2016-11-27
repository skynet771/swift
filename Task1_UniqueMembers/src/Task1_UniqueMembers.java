
import java.util.LinkedHashSet;
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
public class Task1_UniqueMembers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        LinkedHashSet<Integer> set = new LinkedHashSet();
        for (int i = 0; i < num; i++) {
            set.add(scan.nextInt());
        }
        for (Integer i : set) {
            System.out.print(i + " ");
        }

    }

}
