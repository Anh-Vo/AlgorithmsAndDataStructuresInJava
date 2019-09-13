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
        for(int i = 0; i < infixExpression.length; i++) {
            currChar = infixExpression[i]; // Read the char
            if(!operators.containsKey(currChar)) {
                postfixExpression[i] = currChar;
            } else {
                if(stack.isEmpty()) {
                    stack.push(currChar);
                } else {

                }
            }
        }
        return null;
    }

}
