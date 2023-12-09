package nl.r1a;

public class ATM {
    private Tray firstTray;
    public ATM() {
        firstTray = new Tray100();
        firstTray.setNextTray(new Tray20());
    }

    public void process(int amount) {
        firstTray.process(amount);
    }
}
