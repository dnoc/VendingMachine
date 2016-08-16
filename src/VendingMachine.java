import java.util.HashMap;
import java.util.Map;

public class VendingMachine {
    public static final int NOT_ACCEPTED = 0;
    int amount;
    Map<Coin, Integer> coinValueMap;

    public VendingMachine() {
        amount = 0;
        this.coinValueMap = initializeCoinValueMap();
    }

    private Map<Coin, Integer> initializeCoinValueMap() {
        Map<Coin, Integer> coinValueMap = new HashMap<>();
        coinValueMap.put(Coin.QUARTER, 25);
        coinValueMap.put(Coin.DIME, 10);
        coinValueMap.put(Coin.NICKEL, 5);
        coinValueMap.put(Coin.PENNY, NOT_ACCEPTED);
        return coinValueMap;
    }

    private String formatAmountDisplay() {
        if (amount < 100) {
            return String.format("%d CENTS", amount);
        } else {
            return "$1.25";
        }
    }

    public String getDisplay() {
        if (amount == 0) {
            return "INSERT COIN";
        } else {
            return formatAmountDisplay();
        }
    }

    public boolean enter(Coin c) {
        boolean accepted = true;
        if (c == Coin.PENNY) {
            accepted = false;
        }
        amount += coinValueMap.get(c);
        return accepted;
    }

    public void selectProduct(Product product) {

    }
}
