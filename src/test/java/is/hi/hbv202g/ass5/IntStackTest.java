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
    @Test
    public void testPopReturnsPushedValue() {
        stack.push(2);
        assertEquals(2, stack.pop());
    }
    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void ArrayIndexOutOfBoundsException() {
        stack.pop();
    }
    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void OverArrayIndexOutOfBoundsException() {
        int n = stack.getCapacity();
        for(int i = 0; i < n + 1; i++) {
            stack.push(i);
        }
    }
    @Test
    public void testIfStackIsEmpty() {
        assertTrue(stack.isEmpty());
    }
    @Test
    public void falseTestIfStackIsEmpty() {
        stack.push(2);
        assertFalse(stack.isEmpty());
    }

}
