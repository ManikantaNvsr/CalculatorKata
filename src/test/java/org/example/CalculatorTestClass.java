package org.example;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class CalculatorTestClass {

    // Write a test whether the given input is empty or not.
    @Test
    public void CheckEmptinessOfString() {
        boolean check = CalculatorClass.isItEmpty("1,2");
        assertFalse(check);
    }

    // Write a test whether the given input is having more than one number or not.
    @Test
    public void CheckNumberOfInputStringsIsOne() {
        boolean check = CalculatorClass.isNumberOfInputsOne("1");
        assertTrue(check);
    }

    // Write a test whether the given input is two numbers.
    @Test
    public void CheckNumberOfInputStringsIsTwo() {
        boolean check = CalculatorClass.isNumberOfInputsTwo("1,2");
        assertTrue(check);
    }

    // Write a test whether the given inputs sum is correct or not.
    @Test
    public void CheckTheInputNumbersSum() {
        int sum = CalculatorClass.calculateSum("1,2");
        Assert.assertEquals(sum, 3);
    }
}
