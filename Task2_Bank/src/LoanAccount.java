/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class LoanAccount extends Account {
    
    LoanAccount(Customer cust, double balance, double montlyInterestRate,String iban){
        super(cust, balance, montlyInterestRate,iban);
       
    }
    
    @Override
    public double info(int months){
        double balance = 0;
        return balance = super.getOwner().interestInfo(super.getBalance(), super.getInterestRate(), months);
        
    }
     

    @Override
    public void setIBAN(String num) {
        super.setIBAN(num); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setBalance(double money) {
        super.setBalance(money); 
    }

    @Override
    public double getBalance() {
        return super.getBalance(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
