import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class ProductTest {
    VendingMachine vendingMachine;

    @Before
    public void setup() {
        vendingMachine = new VendingMachine();
    }

    @Test
    public void whenAProductIsSelectedWithNoMoneyInsertCoinsIsDisplayed() {
        vendingMachine.selectProduct(Product.COLA);
        assertEquals(vendingMachine.getDisplay(), "INSERT COIN");
    }
}
