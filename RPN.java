import java.io.*;
import java.util.*;
import java.util.Stack;

public class RPN {
    public static void main(String[] args) throws FileNotFoundException
    {
        Stack<String> stack = new Stack<>();

// connect to file and create a scanner to read from file
        FileReader file = new FileReader("C:\\Users\\Joseph Westhoff\\Data Structures\\Labs\\RPN\\src\\postfix.txt");
        Scanner in = new Scanner(file);

        Set<String> set = new HashSet<>();
        set.add("+");
        set.add("-");
        set.add("*");
        set.add("/");
        set.add("^");

        int result = 0;

// read expressions from file and print them out to screen
        while (in.hasNextLine()) {
            String line = in.nextLine();
            String[] T = line.split(" ");

            for (String s : T) {
                if (set.contains(s)) {
                    int operand2 = Integer.parseInt(stack.pop());
                    int operand1 = Integer.parseInt(stack.pop());
                    switch (s) {
                        case "+":
                            result = operand1 + operand2;
                            stack.push(String.valueOf(result));
                            break;
                        case "-":
                            result = operand1 - operand2;
                            stack.push(String.valueOf(result));
                            break;
                        case "*":
                            result = operand1 * operand2;
                            stack.push(String.valueOf(result));
                            break;
                        case "/":
                            result = operand1 / operand2;
                            stack.push(String.valueOf(result));
                            break;
                        case "^":
                            result = (int) Math.pow(operand1, operand2);
                            stack.push(String.valueOf(result));
                            break;
                    }
                } else {
                    stack.push(s);
                }
            }
            System.out.println("Line: " + line);
            System.out.println("Result: " + result);
        }
    }
}