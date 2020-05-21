package liskov_substitution.SecondVariant.test;

import liskov_substitution.SecondVariant.CorporateCustomer;
import liskov_substitution.SecondVariant.Customer;
import liskov_substitution.SecondVariant.IndividualCustomer;
import liskov_substitution.SecondVariant.Subscriber;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SecondCustomerTest {
    @Test
    public void TestCustDifferentType(){
        List<Customer> customerList = new ArrayList<Customer>();
        customerList.add(new IndividualCustomer("Jane", "Individual"));
        customerList.add(new CorporateCustomer("BI Group", "Corporate"));
        for(Customer customer : customerList){
            assertEquals(customer.getCustomerType() + " customer " + customer.getName()+" added to database", customer.addToDatabase());
        }
    }

    @Test
    public void TestCustSubsc(){
        List<Customer> customerList = new ArrayList<Customer>();
        customerList.add(new Subscriber("Alice"));
        for(Customer customer : customerList) {
            assertEquals(customer.getName() + " added to database", customer.addToDatabase());
        }
    }

    @Test
    public void TestCustCash(){
        List<Customer> customerList = new ArrayList<Customer>();
        customerList.add(new IndividualCustomer("Jane", "Individual"));
        customerList.add(new CorporateCustomer("BI Group", "Corporate"));
        for(Customer customer : customerList) {
            assertEquals(customer.getCustomerType() +" customer "+ customer.getName() + " received cashback", customer.receiveCashback());
        }
    }

    @Test
    public void TestSubCash(){
        List<Customer> customerList = new ArrayList<Customer>();
        customerList.add(new Subscriber("Alice"));
        for(Customer customer : customerList) {
            assertEquals("You cannot receive cashback, because you aren't yet an official customer", customer.receiveCashback());
        }
    }
}
