

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
public class Task7_StackMax {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        LinkList st = new LinkList();//My new class LinkList extends LinkedList to Override toString() method
        int maxsofar = 0;
        int set = 0;
        while (set != 1) {
            Scanner scan = new Scanner(System.in);

            String input = scan.nextLine();
            String[] words = input.split(" ");
            String com = words[0];
            int num = 0;
            if (words.length >= 2) {
                num = Integer.parseInt(words[1]);
            }
            switch (com) {
                case "PUSH":
                    st.addFirst(num);
                    maxsofar = maxforPush(num, maxsofar);
                    break;
                case "MAX":
                    System.out.println(maxsofar);
                    break;
                case "end":
                    set = 1;
                    break;
            }

        }

        System.out.println(st.toString());

    }

    public static int maxforPush(int a, int maxsofar) {
        if (a > maxsofar) {
            maxsofar = a;
        } else {
            maxsofar = maxsofar;
        }
        return maxsofar;
    }

}
