/**
* Name: Jingfan_Hu
* Course: CS-665 Software Designs & Patterns
* Date: 10/29/2023
* File Name: FrequentCustomer
* Description: A concrete class that implements the Customer interface, representing a frequent customer. 
*/
package cs665.HW3;

public class FrequentCustomer implements Customer {
    @Override
    public String generateEmail() {
        return "Email for Frequent Customer";
    }
}