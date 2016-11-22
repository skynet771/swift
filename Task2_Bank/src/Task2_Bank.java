
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
public class Task2_Bank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Customer[] users = new Customer[50];
        Account[] acc = new Account[50];
        int userCount = 0;
         
        String inputs = "";
        
        while(!inputs.equals("END")){
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String[] words = input.split(" ");
        String iBAN = "0000"+userCount;
        inputs = words[0];
         
        
        switch(words[0]){
            case "OPEN":{
                switch(Integer.parseInt(words[2])){
            case 1: {Customer user = new IndividualCustomer(words[1]); users[userCount] = user; userCount++;
            
            break;}
            case 2: {Customer user = new CompanyCustomer(words[1]);users[userCount] = user; userCount++;break;}
        }
        switch(Integer.parseInt(words[3])){
            case 1:{DepositAccount acc1 = new DepositAccount(users[userCount-1], Double.parseDouble(words[4]), Double.parseDouble(words[5]), iBAN); acc[userCount-1]=acc1;break;}
            case 2:{LoanAccount acc1 = new LoanAccount(users[userCount-1], Double.parseDouble(words[4]), Double.parseDouble(words[5]), iBAN); acc[userCount-1]=acc1;break;}
            case 3:{MortgageAccount acc1 = new MortgageAccount(users[userCount-1], Double.parseDouble(words[4]), Double.parseDouble(words[5]), iBAN);break;}
        }
        System.out.println(acc[userCount-1].getIBAN());
        break;
            }
            case "PUT":{
                int cc = 0;
                for(int i = 0; i<userCount;i++){
                    if((acc[i].getOwner().getName().equals(words[1])) ||  (acc[i].getIBAN().equals(words[1]))){        
                                acc[i].setBalance(Double.parseDouble(words[2]));
                                cc = i;
                            }
                        
                    }
                System.out.println(acc[cc].getBalance());
                }
                 
                break;
            
            case "INFO":{
                for(int i = 0; i<userCount;i++){
                    if((acc[i].getOwner().getName().equals(words[1])) || acc[i].getIBAN().equals(words[1])){
                        System.out.print(acc[i].info(Integer.parseInt(words[2])));
                    }
                }
            }
            default:  
        }
        
         
         
        //  double bal = acc[userCount-1].info(41);
           
          //System.out.println(bal);
        }
    }
    
}
