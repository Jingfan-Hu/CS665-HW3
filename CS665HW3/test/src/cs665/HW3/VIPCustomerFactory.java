/**
* Name: Jingfan_Hu
* Course: CS-665 Software Designs & Patterns
* Date: 10/29/2023
* File Name: VIPCustomerFactory
* Description: A concrete factory class that implements the CustomerFactory interface, creating instances of VIPCustomer.
*/
package cs665.HW3;

public class VIPCustomerFactory implements CustomerFactory {
    @Override
    public Customer createCustomer() {
        return new VIPCustomer();
    }
}