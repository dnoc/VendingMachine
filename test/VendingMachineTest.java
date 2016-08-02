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

    @Test
    public void whenAQuarterIsEnteredTheDisplayReads25Cents() {
        vendingMachine.enter(Coin.QUARTER);
        assertEquals(vendingMachine.getDisplay(), "25 CENTS");
    }

    @Test
    public void whenADimeIsEnteredTheDisplayReads10Cents() {
        vendingMachine.enter(Coin.DIME);
        assertEquals(vendingMachine.getDisplay(), "10 CENTS");
    }

    @Test
    public void whenANickelIsEnteredTheDisplayReads5Cents() {
        vendingMachine.enter(Coin.NICKEL);
        assertEquals(vendingMachine.getDisplay(), "5 CENTS");
    }

    @Test
    public void whenAPennyIsEnteredTheDisplayReadsInsertCoins() {
        vendingMachine.enter(Coin.PENNY);
        assertEquals(vendingMachine.getDisplay(), "INSERT COIN");
    }

}
