
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
public class Task4d_SumOfNumbersInString {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Pattern p = Pattern.compile("-?\\d+");
        int count =0;
        Matcher m = p.matcher(scan.nextLine());
        while (m.find()) {
        //System.out.println(m.group());
        count++;
        }
        System.out.println(count);
    }
}
