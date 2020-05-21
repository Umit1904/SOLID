package open_close.good.test;
import open_close.good.*;
import org.junit.Test;
import static org.junit.Assert.*;

class MockPersonality implements Personality {

    @Override
    public String greet() {
        return "foo!";
    }
}

public class GoodGreeterTest {
    @Test
    public void TestGreetingInterface(){
        Personality mockPersonality = new MockPersonality();
        Greeter greeter = new Greeter(mockPersonality);
        assertEquals("foo!", greeter.greet());
    }
    @Test
    public void TestGreetsFormally(){
        Personality personality = new FormalPersonality();
        Greeter greeter = new Greeter(personality);
        assertEquals("Good evening, sir.", greeter.greet());
    }
    @Test
    public void TestGreetsCasually(){
        Personality personality = new CasualPersonality();
        Greeter greeter = new Greeter(personality);
        assertEquals("Whatsapp bro?", greeter.greet());
    }
    @Test
    public void TestGreetsInitimately(){
        Personality personality = new IntimatePersonality();
        Greeter greeter = new Greeter(personality);
        assertEquals("Hello Darling!", greeter.greet());
    }
    @Test
    public void TestGreetsBestFriends(){
        Personality personality = new BestFriendPersonality();
        Greeter greeter = new Greeter(personality);
        assertEquals("Salem!", greeter.greet());
    }
}