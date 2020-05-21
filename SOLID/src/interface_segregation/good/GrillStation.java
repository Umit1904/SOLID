package interface_segregation.good;

public class GrillStation implements Grill{

    @Override
    public Meal grillMeal() {
        return new Meal("barbeque");
    }

}