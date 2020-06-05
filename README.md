# Reverse Polish Annotation Calculator
A Java Application that evaluates reverse polish annotation expressions

## The Task
The task is to create a calculator that evaluates expressions in Reverse Polish notation and returns the result of the operation.
Operators are +, -, *.  
For this test, you can assume that there are always spaces between numbers and operators i.e. 3 5 +
and that there are no exceptional situation like division by zero etc.

## Example
4 2 1 + 2 * + 1 + should evaluate to 11.  
*If the expression is empty the result should be 0.*
 
## TDD & Tests
**TDD** methodology was used to develop this application.  
A reverse polish annotation Calculator is a great example of how TDD can be extremely useful as there are many different cases to take into consideration while writing the code.  
**JUnit** library was used to write all the test cases.
