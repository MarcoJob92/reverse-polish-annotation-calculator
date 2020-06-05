package com.tests;

import org.junit.Test;

import com.calculator.ReversePolishNotationCalculator;

import static junit.framework.TestCase.assertEquals;


public class ReversePolishNotationCalculatorTest {
	
    private ReversePolishNotationCalculator calculator = new ReversePolishNotationCalculator();
    
    @Test
    public void testEmptyExpression() {
        double evaluate = calculator.evaluate("");
        double expected = 0;
        assertEquals(expected, evaluate);
    }
    
    @Test
    public void testBlankExpression() {
        double evaluate = calculator.evaluate("  ");
        double expected = 0;
        assertEquals(expected, evaluate);
    }
    
    @Test
    public void testOperands() {
    	// Addition
        double evaluate = calculator.evaluate("3 5 +");
        double expected = 8;
        assertEquals(expected, evaluate);
        // Subtraction
        evaluate = calculator.evaluate("5 2 -");
        expected = 3;
        assertEquals(expected, evaluate);
        // Multiplication
        evaluate = calculator.evaluate("2 9 *");
        expected = 18;
        assertEquals(expected, evaluate);
        // Division
        evaluate = calculator.evaluate("15 3 /");
        expected = 5;
        assertEquals(expected, evaluate);
    }
    
    @Test
    public void testNegativeResultNumber() {
        double evaluate = calculator.evaluate("3 4 5 * -");
        double expected = -17;
        assertEquals(expected, evaluate);
    }
    
    @Test
    public void testDecimalResultNumber() {
        double evaluate = calculator.evaluate("5 2 /");
        double expected = 2.5;
        assertEquals(expected, evaluate);
        // test with delta
    	evaluate = calculator.evaluate("1 3 /");
    	expected = 0.33333;
        assertEquals(expected, evaluate, 0.00001);
    }
    
    @Test
    public void testExpressionWithNegativeNumbers() {
        double evaluate = calculator.evaluate("4 -2 -1 + +");
        double expected = 1;
        assertEquals(expected, evaluate);
    }
    
    @Test
    public void testExpressionWithDecimalNumbers() {
        double evaluate = calculator.evaluate("4.5 6.0 3.7 - +");
        double expected = 6.8;
        assertEquals(expected, evaluate);
    }
    
    @Test
    public void testComplexOperations() {
        double evaluate = calculator.evaluate("4 2 1 + 2 * + 1 +");
        double expected = 11;
        assertEquals(expected, evaluate);
        
        evaluate = calculator.evaluate("1 7 6 9 + - * 7 *");
        expected = -56;
        assertEquals(expected, evaluate);
        
        evaluate = calculator.evaluate("9 2 -3 - * 6 2 / 5 7 5 * + - +");
        expected = 8;
        assertEquals(expected, evaluate);
    }
    
    @Test
    public void testExpressionWithBigNumbers() {
        double evaluate = calculator.evaluate("432 681 -171 + + 234 * 194 /");
        double expected = 1136.22680412371134;
        assertEquals(expected, evaluate);
    }
    
}
