import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class CircularBufferTest {

    CircularBuffer circularBuffer = new CircularBuffer(2);

    @Test
    public void testOffer() {

        assertTrue(circularBuffer.offer("a"));
        assertTrue(circularBuffer.offer("b"));
        assertTrue(circularBuffer.offer("c"));
    }
}
