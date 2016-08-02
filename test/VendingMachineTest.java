import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VendingMachineTest {
    VendingMachine vendingMachine;

    @Before
    public void setup() {
        vendingMachine = new VendingMachine();
    }

    @Test
    public void whenThereIsNoMoneyTheDisplayReadsInsertCoins() {
        assertEquals(vendingMachine.getDisplay(), "INSERT COIN");
    }

}
