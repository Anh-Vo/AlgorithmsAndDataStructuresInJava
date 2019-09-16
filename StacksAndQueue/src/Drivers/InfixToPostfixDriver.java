package Drivers;

import Apps.InfixToPostfixTranslator;

public class InfixToPostfixDriver {
    public static void main(String[] args) {
        String test = "A+B*(C-D)";
        InfixToPostfixTranslator t = new InfixToPostfixTranslator(test);
        System.out.println(t.getInfixExpression());
        System.out.println(t.translate());
        test ="A*B-(C+D)+E";
        t = new InfixToPostfixTranslator(test);
        System.out.println(t.getInfixExpression());
        System.out.println(t.translate());
    }
}
