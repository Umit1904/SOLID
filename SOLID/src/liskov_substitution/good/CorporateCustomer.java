package liskov_substitution.good;

public class CorporateCustomer extends Customer implements Cashback{
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