package nl.r1a;

public abstract class Tray {
    private int currencyDenomination;
    private Tray nextTray;

    public Tray(int currenctDenomination) {
        this.currencyDenomination = currenctDenomination;
    }

    public Tray setNextTray(Tray nextTray) {
        this.nextTray = nextTray;
        return nextTray;
    }

    public void process(int amount) {
        if (nextTray != null) {
            nextTray.process(amount % currencyDenomination);
        } else {
            if (amount % currencyDenomination != 0) {
                throw new IllegalArgumentException("Cannot process amount");
            }
        }
        System.out.format("Please take %d of denomination %d\n",
                          amount / currencyDenomination, currencyDenomination);
    }
}
