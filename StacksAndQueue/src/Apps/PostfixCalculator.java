package Apps;

import java.util.Stack;

public class PostfixCalculator {
    private InfixToPostfixTranslator itp;
    private String postfixExpression;
    private Stack<Integer> stack;

    public PostfixCalculator(String e) {
        itp = new InfixToPostfixTranslator(e);
        postfixExpression = itp.translate();
        stack = new Stack<>();
    }

    public int calculate() {
        System.out.println("Evaluating: " + postfixExpression);
        for(int i = 0; i < postfixExpression.length(); i++) {
            char c = postfixExpression.charAt(i);
            if(c >= '0' && c <= '9') {
                stack.push((int) (c - '0'));
                System.out.println("pushing " + c);
            } else {
                int num1 = stack.pop();
                int num2 = stack.pop();
                int result;
                switch(c) {
                    case '+':
                        result = num1 + num2;
                        break;
                    case '-':
                        result = num1 - num2;
                        break;
                    case '*':
                        result = num1 * num2;
                        break;
                    case '/':
                        result = num1 / num2;
                        break;
                    case '^':
                        result = (int) Math.pow(num1, num2);
                        break;
                    default:
                        result = 0;
                }
                stack.push(result);
            }
        }
        return stack.pop();
    }
}
