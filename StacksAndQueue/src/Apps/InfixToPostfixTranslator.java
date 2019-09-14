package Apps;

import Stacks.ArrayBasedStacks.ArrStack;

import java.util.Map;

public class InfixToPostfixTranslator {
    private ArrStack stack;
    private char[] infixExpression;
    private char[] postfixExpression;
    private char[] operands = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    private Map<Character, Integer> operators = Map.of(
            '(', 1,
            ')', 1,
            '*', 2,
            '/', 2,
            '+', 3,
            '-', 3
    );


    public InfixToPostfixTranslator(String s) {
       stack = new ArrStack(s.length());
       infixExpression = s.toCharArray();
       postfixExpression = new char[infixExpression.length];
    }

    public String translate() {
        char currChar;
        char topOp;
        int result;
        int lastInsertion = 0;
        for(int i = 0; i < infixExpression.length; i++) {
            currChar = infixExpression[i]; // Read the char
            if(!operators.containsKey(currChar)) { // If not an operator
                postfixExpression[i] = currChar;
                lastInsertion = i;
            } else { // Is an operator
                if(stack.isEmpty()) {
                    stack.push(currChar); // Don't need to check precedence
                } else { // Check Precedence
                    topOp = stack.pop();
                    result = comparePrecendence(topOp, currChar);
                    if(result >= 0) {
                        stack.push(topOp); // topOp has higher precendence
                        break;
                    } else if(result < 0) {
                        stack.push(currChar); // topOp has lower precendence
                        stack.push(topOp);
                    }
                }
            }
        }

        while(!stack.isEmpty()) {
            postfixExpression[++lastInsertion] = stack.pop();
        }

        return postfixExpression.toString();
    }

    private int comparePrecendence(char a, char b) {
        return (operators.get(a) - operators.get(b));
    }

}
