/**
* Name: Jingfan_Hu
* Course: CS-665 Software Designs & Patterns
* Date: 10/29/2023
* File Name: EmailGenerator
* Description: A class that utilizes the Factory Method pattern to generate emails for different customer types. It takes a CustomerFactory as input and returns the email content for the specified customer type.
*/
package cs665.HW3;

public class EmailGenerator {
    public String generateEmail(CustomerFactory factory) {
        Customer customer = factory.createCustomer();
        return customer.generateEmail();
    }
}