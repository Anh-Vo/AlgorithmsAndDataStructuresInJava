package Apps;

import Stacks.ArrayBasedStacks.ArrStack;

public class InfixToPostfixTranslator {
    private ArrStack stack;
    private String infixExpression;
    private StringBuilder postfixExpression;


    public InfixToPostfixTranslator(String s) {
       stack = new ArrStack(s.length());
       infixExpression = s;
       postfixExpression = new StringBuilder();
    }

    public String getInfixExpression() {
        return new String(infixExpression);
    }

    public String translate() {
        for(int i = 0; i < infixExpression.length(); i++) {
            char c = infixExpression.charAt(i);
            if(getPrecendence(c) > 0) { // is an operator
                while(!stack.isEmpty() && getPrecendence(stack.peek()) >= getPrecendence(c)) {
                    postfixExpression.append(stack.pop());
                }
                stack.push(c);
            } else if(c == '(') {
               stack.push(c);
            } else if(c == ')') {
                while(!stack.isEmpty() && stack.peek() != '(') {
                    postfixExpression.append(stack.pop());
                }
                if(stack.peek() == '(') {
                    stack.pop();
                }
            } else {
                postfixExpression.append(c);
            }
        }

        while(!stack.isEmpty()) {
            postfixExpression.append(stack.pop());
        }

        return postfixExpression.toString();
    }

    private static int getPrecendence(char c) {
        switch (c) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }



}
