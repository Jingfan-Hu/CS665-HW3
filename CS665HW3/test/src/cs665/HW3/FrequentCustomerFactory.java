/**
* Name: Jingfan_Hu
* Course: CS-665 Software Designs & Patterns
* Date: 10/29/2023
* File Name: FrequentCustomerFactory
* Description: A concrete factory class that implements the CustomerFactory interface, creating instances of FrequentCustomer.
*/
package cs665.HW3;

public class FrequentCustomerFactory implements CustomerFactory {
    @Override
    public Customer createCustomer() {
        return new FrequentCustomer();
    }
}