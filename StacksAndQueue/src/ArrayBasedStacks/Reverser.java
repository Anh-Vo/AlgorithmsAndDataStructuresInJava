package ArrayBasedStacks;

import interfaces.Stackx;

public class Reverser {
    private String input;
    private String output;

    public Reverser(String in) {
        input = in;
    }

    public String reverse() {
        int stackSize = input.length();
        Stackx stack = new ArrStack(stackSize);
        for(int i = 0; i < stackSize; i++) {
            char ch = input.charAt(i);
            stack.push(ch);
        }
        output = "";
        while(!stack.isEmpty()) {
            output += stack.pop();
        }
        return output;
    }
}
