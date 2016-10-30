
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
public class Task3c_CaesarCipher {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String userChoice = scan.nextLine();
        switch(userChoice){
            case "encode": StringBuilder sb=new StringBuilder();
                            for(int i=0;i<s.length();i++){
                            char x=s.charAt(i);
                            if(x==' '){
                            sb.append(' ');
                            }
                            else if(x>='A' && x<='Z'){
                            int x1=x-'A'+1;
                            x1=x1%26;
                            sb.append((char)(x1+'A'));
                            }
                            else if(x>='a' && x<='z'){
                            int x1=x-'a'+1;
                            x1=x1%26;
                            sb.append((char)(x1+'a'));
                            }
                        }
                            System.out.println(sb.toString());
                break;
            case "decode": StringBuilder sb2=new StringBuilder();
                            for(int i=0;i<s.length();i++){
                            char t=s.charAt(i);
                            if(t==' '){
                            sb2.append(' ');
                            }
                            else if(t>='A' && t<='Z'){
                            int t1=t-'A'-1;
                            if(t1<0)t1=26+t1;
                            sb2.append((char)(t1+'A'));
                            }
                            else if(t>='a' && t<='z'){
                            int t1=t-'a'-1;
                            if(t1<0)t1=26+t1;
                            sb2.append((char)(t1+'a'));
                            }
                        }
                            System.out.println(sb2.toString());
                break;
        }
             
                 
         
         
         
         
     
    }
}
