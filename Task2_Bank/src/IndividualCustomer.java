/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class IndividualCustomer extends Customer{
      
    public IndividualCustomer(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return super.getName(); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
     public double interestInfo(double balance, double interestRate, int months){
         return (balance*interestRate/100)*(months-3);
     }
     @Override
     public double interestInfoMortgage(double balance, double interestRate, int months){
         double result = 0.0;
         if(months>=6){
             result= (balance*interestRate/100)*(months-6);
         } else if(months<6){
             result =  balance;
         }
         return result;
          
     }
    
}
