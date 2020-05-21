package liskov_substitution.SecondVariant;

import liskov_substitution.SecondVariant.Customer;

public class IndividualCustomer extends Customer{

    public IndividualCustomer(String name, String customerType) {
        super(name);
        this.customerType = customerType;
    }

    @Override
    public String addToDatabase() {
        return "Individual customer " + this.name + " added to database";

    }

    @Override
    public String receiveCashback() {
        return "Individual customer " + this.name + " received cashback";
    }
}