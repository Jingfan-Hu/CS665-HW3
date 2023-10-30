/**
* Name: Jingfan_Hu
* Course: CS-665 Software Designs & Patterns
* Date: 10/29/2023
* File Name: NewCustomerFactory
* Description: A concrete factory class that implements the CustomerFactory interface, creating instances of NewCustomer.
*/
package cs665.HW3;

public class NewCustomerFactory implements CustomerFactory {
    @Override
    public Customer createCustomer() {
        return new NewCustomer();
    }
}
