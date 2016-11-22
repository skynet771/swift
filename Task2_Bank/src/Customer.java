/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Customer {
    private String _name;
  
        Customer(String name){
            _name = name;
           
          
        }
        public String getName(){
            return _name;
        }
       
        public double interestInfo(double balance, double interestRate, int months){
            return 0.0;
        }
         public double interestInfoMortgage(double balance, double interestRate, int months){
             return 0.0;
        }
         public String getIBAN(){
             return "";
         }
}
