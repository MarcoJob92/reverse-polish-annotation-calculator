package com.calculator;

import java.util.Stack;
import java.util.function.BiFunction;


public class ReversePolishNotationCalculator {
	
	public double evaluate(String expression) {
		if (expression.trim().equals(""))
			return 0;
        Stack<Double> stack = new Stack<Double>();
        String[] operandsAndOperators = expression.split(" ");
        for(String op : operandsAndOperators){
            switch(op) {
                case "+":
                	operation(stack, (n1, n2) -> n2 + n1);
                    break;
                case "-":
                	operation(stack, (n1, n2) -> n2 - n1);
                    break;
                case "*":
                	operation(stack, (n1, n2) -> n2 * n1);
                    break;
                case "/":
                	operation(stack, (n1, n2) -> n2 / n1);
                    break;
                default:
                	stack.push(Double.valueOf(op));
            }
        }
        return stack.pop();
    }

    private void operation(Stack<Double> numbers, BiFunction<Double, Double, Double> operation) {
        numbers.push(operation.apply(numbers.pop(), numbers.pop()));
    }
    
}
