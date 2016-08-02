import java.util.HashMap;
import java.util.Map;

public class VendingMachine {
    int amount;
    Map<Coin, Integer> coinValueMap;

    public VendingMachine() {
        amount = 0;
        coinValueMap = new HashMap<>();
        coinValueMap.put(Coin.QUARTER, 25);
        coinValueMap.put(Coin.DIME, 10);
        coinValueMap.put(Coin.NICKEL, 5);
        coinValueMap.put(Coin.PENNY, 0);
    }

    public String getDisplay() {
        if (amount == 0) {
            return "INSERT COIN";
        } else {
            return String.format("%d CENTS", amount);
        }
    }

    public void enter(Coin c) {
        amount += coinValueMap.get(c);
    }
}
