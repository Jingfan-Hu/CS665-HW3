package cs665.HW3;

/**
* Name: Jingfan_Hu
* Course: CS-665 Software Designs & Patterns
* Date: 10/29/2023
* File Name: EmailGeneratorTest
* Description: A JUnit test class that contains individual test methods for each type of customer to verify that the email generation functionality works correctly for all customer segments.
*/
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class EmailGeneratorTest {

    @Test
    public void testBusinessCustomerEmail() {
        CustomerFactory factory = new BusinessCustomerFactory();
        EmailGenerator generator = new EmailGenerator();
        String email = generator.generateEmail(factory);
        assertEquals("Email for Business Customer", email);
    }

    @Test
    public void testReturningCustomerEmail() {
        CustomerFactory factory = new ReturningCustomerFactory();
        EmailGenerator generator = new EmailGenerator();
        String email = generator.generateEmail(factory);
        assertEquals("Email for Returning Customer", email);
    }

    @Test
    public void testFrequentCustomerEmail() {
        CustomerFactory factory = new FrequentCustomerFactory();
        EmailGenerator generator = new EmailGenerator();
        String email = generator.generateEmail(factory);
        assertEquals("Email for Frequent Customer", email);
    }

    @Test
    public void testNewCustomerEmail() {
        CustomerFactory factory = new NewCustomerFactory();
        EmailGenerator generator = new EmailGenerator();
        String email = generator.generateEmail(factory);
        assertEquals("Email for New Customer", email);
    }

    @Test
    public void testVIPCustomerEmail() {
        CustomerFactory factory = new VIPCustomerFactory();
        EmailGenerator generator = new EmailGenerator();
        String email = generator.generateEmail(factory);
        assertEquals("Email for VIP Customer", email);
    }
}
