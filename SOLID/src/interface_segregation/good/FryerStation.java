package interface_segregation.good;

public  class FryerStation implements Fry{

    @Override
    public Meal fryMeal() {
        return new Meal("stake");
    }
}