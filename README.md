
# Reverse Polish Notation (RPN) Calculator

This project is a simple Reverse Polish Notation (RPN) calculator implemented in Java. The RPN calculator evaluates expressions in postfix notation using a stack-based approach.

## Files Included

1. **RPN.java**: The main class that reads expressions from the `postfix.txt` file, evaluates them using the RPN algorithm, and prints the results to the console.
2. **Node.java**: A generic class representing a node in a linked list, used in implementing the stack.
3. **Stack.java**: A generic interface defining the basic operations of a stack data structure.
4. **StackRef.java**: A generic class implementing the `Stack` interface using a linked list-based approach.
5. **postfix.txt**: A text file containing postfix expressions to be evaluated by the RPN calculator.

## How to Run

1. Ensure you have Java installed on your system.
2. Compile all the Java files using a Java compiler. You can use the following command:
	``` javac RPN.java Node.java Stack.java StackRef.java ```
3. Run the RPN calculator by executing the compiled `RPN` class:
	```java RPN```

## Understanding postfix.txt

The `postfix.txt` file contains postfix expressions, each expression written on a separate line. The expressions consist of operands and operators separated by spaces. The RPN calculator reads each line from this file, evaluates the expression, and prints the result.

## How RPN Calculator Works

1. The RPN calculator reads each line from the `postfix.txt` file.
2. It parses the expression into operands and operators.
3. It evaluates the expression using a stack-based algorithm:
- When an operand is encountered, it is pushed onto the stack.
- When an operator is encountered, the required number of operands are popped from the stack, the operator is applied, and the result is pushed back onto the stack.
4. After evaluating the expression, the result is printed to the console.

## Example postfix.txt Expressions

- `2 3 4 + +`: Evaluates to `9`.
- `12 6 / 4 * 4 +`: Evaluates to `12`.
- `2 2 3 3 * * *`: Evaluates to `36`.
- `7 5 / 5 + 17 -`: Evaluates to `-11`.
- `4 3 - 5 6 + 4 * -`: Evaluates to `-43`.
- `1 1 + 3 * 4 - 10 ^`: Evaluates to `1024`.

## Contributors

- [Joseph Westhoff](https://github.com/jtwesthoff)
