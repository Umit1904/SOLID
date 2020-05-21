package liskov_substitution.SecondVariant;

import liskov_substitution.SecondVariant.Customer;
public class CorporateCustomer extends Customer{
    public CorporateCustomer(String name, String customerType){
        super(name);
        this.customerType = customerType;
    }

    @Override
    public String addToDatabase() {
        return "Corporate customer " + this.name +  " added to database";
    }

    @Override
    public String receiveCashback() {
        return "Corporate customer " + this.name + " received cashback";
    }
}