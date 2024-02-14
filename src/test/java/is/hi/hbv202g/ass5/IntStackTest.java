package is.hi.hbv202g.ass5;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class IntStackTest {
    IntStack stack;

    @Before
    public void NewStackIsNotFull() {
        stack = new IntStack();
    }

    @Test
    public void testNewStackIsNotFull() {
        assertFalse(stack.isFull());
    }
    @Test
    public void testFullStackIsFull() {
        int n = stack.getCapacity();
        for(int i = 0; i < n; i++) {
            stack.push(i);
        }
        assertTrue(stack.isFull());
    }
    @Test
    public void testNearFullStackIsNotFull() {
        int n = stack.getCapacity();
        for(int i = 0; i < n - 1; i++) {
            stack.push(i);
        }
        assertFalse(stack.isFull());
    }

}
