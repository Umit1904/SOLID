package interface_segregation.good.test;

import interface_segregation.good.Kitchen;
import interface_segregation.good.Order;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class GoodKitchenTest {
    @Test
    public void TestDifferentMeals() throws Exception {
        Kitchen kitchen = new Kitchen();
        Order order1 = new Order(true, false);
        Order order2 = new Order(false, true);
        assertEquals("stake", kitchen.cookOrder(order1).getName());
        assertEquals("barbeque", kitchen.cookOrder(order2).getName());
    }
}
