package Regression;

import java.util.Stack;

public class InfixToPostfix1 {
    public static void main(String[] args) {
        String t1 = "A+B*(C-D)";
        String t2 = "A*B+(C-D)";
        System.out.println(t1);
        System.out.println(toPostfix(t1));
        System.out.println(t2);
        System.out.println(toPostfix(t2));
    }

   public static String toPostfix(String s) {
       Stack<Character> stack = new Stack<>();
       StringBuilder output = new StringBuilder();

        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(getPrecendence(c) > 0) {
                while(!stack.isEmpty() && getPrecendence(c) <= getPrecendence(stack.peek())) {
                    output.append(stack.pop());
                }
                stack.push(c);
            } else if(c == '(') {
                stack.push(c);
            } else if(c == ')') {
                while(!stack.isEmpty() && stack.peek() != '(') {
                    output.append(stack.pop());
                }
                if(!stack.isEmpty() && stack.peek() == '(') {
                    stack.pop();
                }
            } else {
                output.append(c);
            }
        }
        while(!stack.isEmpty()) {
            output.append(stack.pop());
        }
        return output.toString();
   }

   public static int getPrecendence(char c) {
        switch(c) {
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
