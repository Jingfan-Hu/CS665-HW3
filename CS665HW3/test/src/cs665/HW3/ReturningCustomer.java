/**
* Name: Jingfan_Hu
* Course: CS-665 Software Designs & Patterns
* Date: 10/28/2023
* File Name: ReturningCustomer
* Description: A concrete class that implements the Customer interface, representing a returning customer.
*/
package cs665.HW3;

public class ReturningCustomer implements Customer {
    @Override
    public String generateEmail() {
        return "Email for Returning Customer";
    }
}