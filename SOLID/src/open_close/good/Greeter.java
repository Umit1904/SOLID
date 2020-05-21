package open_close.good;

public class Greeter {
    private Personality personality;
    public Greeter(Personality personality){
        this.personality  = personality;
    }
    public String greet(){
        return personality.greet();
    }
}