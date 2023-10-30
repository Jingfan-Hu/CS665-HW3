/**
* Name: Jingfan_Hu
* Course: CS-665 Software Designs & Patterns
* Date: 10/29/2023
* File Name: NewCustomer
* Description: A concrete class that implements the Customer interface, representing a new customer. It generates a specific email for new customers.
*/
package cs665.HW3;

public class NewCustomer implements Customer {
    @Override
    public String generateEmail() {
        return "Email for New Customer";
    }
}