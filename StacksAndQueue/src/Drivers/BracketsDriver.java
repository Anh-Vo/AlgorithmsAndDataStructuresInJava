package Drivers;

import Apps.BracketsApp;

public class BracketsDriver {
    public static void main(String[] args) {
        String test1 = "{}[]()";
        String test2 = "{[]()";
        String test3 = "{[]()}";
        String test4 = "{[]]()";

        BracketsApp ba = new BracketsApp(test1);
        System.out.println(ba.check());
        ba = new BracketsApp(test2);
        System.out.println(ba.check());
        ba = new BracketsApp(test3);
        System.out.println(ba.check());
        ba = new BracketsApp(test4);
        System.out.println(ba.check());
    }
}
