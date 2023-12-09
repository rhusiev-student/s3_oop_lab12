package nl.r1a;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class ATMTest {
    @Test
    public void testATM() {
        ATM atm = new ATM();
        try {
            atm.process(220);
        } catch (Exception e) {
            fail("ATM.process() threw an exception for 220");
        }
        try {
            atm.process(230);
            fail("ATM.process() did not throw an exception for 230");
        } catch (Exception e) {
            assertEquals("Cannot process amount", e.getMessage());
        }
    }
}
