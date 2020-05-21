package open_close.bad.test;
import open_close.bad.BadGreeter;
import org.junit.Test;
import static org.junit.Assert.*;


public class BadGreeterTest {
    @Test
    public void TestGreetsFormally(){
        BadGreeter greater = new BadGreeter();
        greater.setFormality("formal");
        assertEquals("Good evening, sir.", greater.greet());
    }
    @Test
    public void TestGreetsCasually(){
        BadGreeter greater = new BadGreeter();
        greater.setFormality("casual");
        assertEquals("Whatsapp bro?", greater.greet());
    }
    @Test
    public void TestGreetsIntimately(){
        BadGreeter greater = new BadGreeter();
        greater.setFormality("intimate");
        assertEquals("Hello Darling!", greater.greet());
    }
    @Test
    public void TestGreetsByDefault(){
        BadGreeter greater = new BadGreeter();
        assertEquals("hello.", greater.greet());
    }

}