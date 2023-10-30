/**
* Name: Jingfan_Hu
* Course: CS-665 Software Designs & Patterns
* Date: 10/29/2023
* File Name: BusinessCustomerFactory
* Description: A concrete factory class that implements the CustomerFactory interface, creating instances of BusinessCustomer.
*/
package cs665.HW3;

public class BusinessCustomerFactory implements CustomerFactory {
    @Override
    public Customer createCustomer() {
        return new BusinessCustomer();
    }
}