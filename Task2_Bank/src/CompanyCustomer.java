/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class CompanyCustomer extends Customer {
    CompanyCustomer(String name) {
        super(name);
    }
    @Override
    public String getName() {
        return super.getName(); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
     public double interestInfo(double balance, double interestRate, int months){
         return (balance*interestRate/100)*(months-2);
     }
    @Override
     public double interestInfoMortgage(double balance, double interestRate, int months){
         double result=0.0;
         if(months>=12){
              int res = months;
         result = (balance*(interestRate/2)/100)*(res-12);
        result += (balance*interestRate/100)*res;
         } else{
             result = (balance*interestRate/100)*months;
         }
          
        return result;
     }
}
