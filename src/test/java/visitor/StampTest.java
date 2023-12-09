package visitor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class StampTest {
    @Test
    public void testStamp() {
        Group<String> group = new Group<>();
        Signature<String> signature1 = new Signature<>(s -> System.out.println("Hello " + s));
        Signature<String> signature2 = new Signature<>(s -> System.out.println("Goodbye " + s));
        group.addTask(signature1);
        group.addTask(signature2);
        try {
            group.apply("World");
        } catch (Exception e) {
            fail("Group.apply() threw an exception for 'World'");
        }
    }
}
