package liskov_substitution.good;

public abstract class Customer {
    String name;
    String customerType;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public Customer(String name){
        this.name = name;
    }
    public abstract String addToDatabase();
}