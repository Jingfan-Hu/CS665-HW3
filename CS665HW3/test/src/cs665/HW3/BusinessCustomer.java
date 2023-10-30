/**
* Name: Jingfan_Hu
* Course: CS-665 Software Designs & Patterns
* Date: 10/28/2023
* File Name: BusinessCustomer
* Description: A concrete class that implements the Customer interface, representing a business customer
*/
package cs665.HW3;

public class BusinessCustomer implements Customer {
    @Override
    public String generateEmail() {
        return "Email for Business Customer";
    }
}