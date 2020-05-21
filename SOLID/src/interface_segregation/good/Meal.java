package interface_segregation.good;

public class Meal{
    String name;
    public Meal(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
}