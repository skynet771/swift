/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class DepositAccount extends Account {
    
    DepositAccount(Customer owner, double balance, double montlyInterestRate, String iban){
        super( owner, balance, montlyInterestRate, iban);
    }

   
    
       @Override
    public void setBalance(double money) {
        super.setBalance(money); 
    }

    @Override
    public double getBalance() {
        return super.getBalance(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setIBAN(String num) {
        super.setIBAN(num); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
