package liskov_substitution.SecondVariant;

public class Subscriber extends Customer{
    public Subscriber(String name){
        super(name);
    }

    @Override
    public String  addToDatabase() {
        return name + " added to database";
    }
}