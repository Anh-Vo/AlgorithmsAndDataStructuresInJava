package Drivers;

import Apps.PostfixCalculator;

public class PostfixCalculatorDriver {
    public static void main(String[] args) {
        String a = "4+2*(1^1)";
        PostfixCalculator calculator = new PostfixCalculator(a);

        System.out.println(a + "= " + 9);
        System.out.println("result = " + calculator.calculate());

    }
}
