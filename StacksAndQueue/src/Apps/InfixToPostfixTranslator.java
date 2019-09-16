package Apps;

import Stacks.ArrayBasedStacks.ArrStack;

import java.util.Map;

public class InfixToPostfixTranslator {
    private ArrStack stack;
    private String infixExpression;
    private StringBuilder postfixExpression;
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
       infixExpression = s;
       postfixExpression = new StringBuilder();
    }

    public String getInfixExpression() {
        return new String(infixExpression);
    }

    public String translate() {
        char curr;
        char top;
        int result;
        for(int i = 0; i < infixExpression.length(); i++) {
            curr = infixExpression.charAt(i);
            if(!operators.containsKey(curr)) {
                postfixExpression.append(curr); //append to output
            } else if(curr == '(') {
               stack.push(curr);
            } else if(curr == ')') {
                while(!stack.isEmpty() && stack.peek() != '(') {
                    postfixExpression.append(stack.pop());
                }
                if(!stack.isEmpty() && stack.peek() != '(') {
                    return null;
                } else if(!stack.isEmpty()) {
                    stack.pop();
                }
            } else if(operators.containsKey(curr)) {
                if(!stack.isEmpty() && comparePrecendence(curr, stack.peek()) > 0) {
                    postfixExpression.append(stack.pop());
                }
                stack.push(curr);
            }
        }

        while (!stack.isEmpty()) {
            postfixExpression.append(stack.pop());
        }

        return postfixExpression.toString();
    }

    private int comparePrecendence(char a, char b) {
        return (operators.get(a) - operators.get(b));
    }

}
