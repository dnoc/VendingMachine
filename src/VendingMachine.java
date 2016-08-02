
public class VendingMachine {
    int amount;

    public VendingMachine() {
        amount = 0;
    }

    public String getDisplay() {
        if (amount == 0) {
            return "INSERT COIN";
        } else {
            return String.format("%d CENTS", amount);
        }
    }

    public void enter(Coin c) {
        amount += 25;
    }
}
