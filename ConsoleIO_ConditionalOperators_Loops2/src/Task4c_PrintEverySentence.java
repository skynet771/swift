
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Task4c_PrintEverySentence {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();       
        Matcher m = Pattern.compile("[^?!.]+(?:[.?!]|$)")
        .matcher(str);
         while (m.find()) {
        System.out.println(m.group());
        }
    }
}
