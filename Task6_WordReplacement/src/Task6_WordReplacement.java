
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
public class Task6_WordReplacement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();
        ArrayList<String> list2 = new ArrayList<String>();

        String input2 = scan.nextLine();
        String input = input2.toLowerCase();
        String[] words = input.split(" ");
        //for(int s=0;s<words.length;s++){
        // list3.add(words[s]);
        //}
        int n = scan.nextInt();
        scan.nextLine();
        for (int y = 0; y < n; y++) {
            String temp = scan.nextLine();
            String secondStr = temp.toLowerCase();
            String words2[] = secondStr.split(" ");
            list.add(words2[0]);
            list2.add(words2[1]);
        }

        for (int i = 0; i < words.length; i++) {
            int idx = list.indexOf(words[i]);
            if (idx != -1) {
                words[i] = list2.get(idx);
            }
        }

        String s = sentenceBuild(words);
        System.out.println(s);

    }

    public static String sentenceBuild(String[] arr) {
        StringBuilder builder = new StringBuilder();
        for (String s : arr) {
            builder.append(s + " ");
        }
        return builder.toString();
    }

}
