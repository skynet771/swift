/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Account {
    
    private Customer _owner;
    private double _balance;
    private double _montlyInterestRate;
    private String _iBAN;
     Account( Customer owner, double balance, double montlyInterestRate, String iban){
          
         _owner = owner;
         _balance = balance;
         _montlyInterestRate = montlyInterestRate;
         _iBAN = iban;
     }
     public void setIBAN(String num){
         _iBAN = num;
     }
    public String getIBAN(){
        return _iBAN;
    }
     public Customer getOwner(){
         return _owner;
     }
     public double getBalance(){
         return _balance;
     }
     public double getInterestRate(){
         return _montlyInterestRate;
     }
     public void setBalance(double money){
         _balance = _balance+ money;
     }
     public double info(int months){
         return 0.0;
     }
     
}
