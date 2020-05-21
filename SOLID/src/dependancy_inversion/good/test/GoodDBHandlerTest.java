package dependancy_inversion.good.test;

import dependancy_inversion.good.DatabaseHandler;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GoodDBHandlerTest {
    @Test
    public void TestDBOR() throws Exception {
        DatabaseHandler databaseHandler = new DatabaseHandler();
        assertEquals("connecting to oracle..", databaseHandler.connect("OracleDatabase"));
        assertEquals("disconnecting from oracle..", databaseHandler.disconnect("OracleDatabase"));
    }
    @Test
    public void TestDBMySQL() throws Exception {
        DatabaseHandler databaseHandler = new DatabaseHandler();
        assertEquals("connecting database..", databaseHandler.connect("MySQLDatabase"));
        assertEquals("disconnecting database..", databaseHandler.disconnect("MySQLDatabase"));
    }
}
