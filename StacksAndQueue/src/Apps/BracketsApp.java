package Apps;

import Stacks.ArrayBasedStacks.ArrStack;
import interfaces.Stackx;

public class BracketsApp {
    private String input;

    public BracketsApp(String in) {
        input = in;
    }

    public boolean check() {
        int stackSize = input.length();
        Stackx stack = new ArrStack(stackSize);

        for(int i = 0; i < input.length(); i++) {
            char in = input.charAt(i);
            switch(in) {
                case '{' :
                case '[':
                case '(':
                    stack.push(in);
                break;
                case '}':
                case ']':
                case ')':
                if(!stack.isEmpty()) {
                    char out = (char) stack.pop();
                    if( (in == '}') && (out != '{') ||
                        (in == ']') && (out != '[') ||
                        (in == ')') && (out != '(')
                    ) {
                        System.out.println("Error: " + in + " at " + i);
                        return false;
                    }
                } else {
                    System.out.println("Error: missing right delimiter");
                    return false;
                }
                break;
            }
        }
        if(!stack.isEmpty()) {
            System.out.println("Error: missing right delimiter");
            return false;

        }
        return true;
    }

}
