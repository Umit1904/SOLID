package liskov_substitution.SecondVariant;

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
    public String receiveCashback(){
        return "You cannot receive cashback, because you aren't yet an official customer";
    }
}