package liskov_substitution.good.test;

import liskov_substitution.good.CorporateCustomer;
import liskov_substitution.good.Customer;
import liskov_substitution.good.IndividualCustomer;
import liskov_substitution.good.Subscriber;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class GoodCustomerTest {
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
}
