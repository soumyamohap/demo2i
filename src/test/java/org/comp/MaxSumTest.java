package org.comp;

import java.util.List;
import org.comp.MaxSum;
import org.junit.Assert;
import org.junit.Test;

public class MaxSumTest {
    MaxSum maxSum = new MaxSum();

    @Test
    public void testSum() {
        var input = List.of("abc12gb", "defg657", "dh7js4jf", "or2rjvn2w", "h1n36mfl", "a7e6fw");
        var actualResult = maxSum.findMaxNum(input);
        Assert.assertTrue(actualResult==18);
    }

    @Test(expected = RuntimeException.class)
    public void testMaxInputArraySize() {
        var input = List.of("abc12gb", "defg657", "dh7js4jf", "or2rjvn2w", "h1n36mfl", "a7e6fw",
                "abc12gb", "defg657", "dh7js4jf", "or2rjvn2w", "h1n36mfl", "a7e6fw");
        maxSum.findMaxNum(input);
    }

    @Test(expected = RuntimeException.class)
    public void testMaxInputStringLength() {
        var input = List.of("abcdsdsdd12gb", "defg657", "dh7js4jf", "or2rjvn2w", "h1n36mfl", "a7e6fw");
        maxSum.findMaxNum(input);
    }

    @Test
    public void testMaxInputArraySizeMessage() {
        var input = List.of("abc12gb", "defg657", "dh7js4jf", "or2rjvn2w", "h1n36mfl", "a7e6fw",
                "abc12gb", "defg657", "dh7js4jf", "or2rjvn2w", "h1n36mfl", "a7e6fw");
       try {
           maxSum.findMaxNum(input);
       } catch (RuntimeException exception) {
           Assert.assertEquals("Max Input array size should 10",
                   exception.getMessage());
       }
    }

}

