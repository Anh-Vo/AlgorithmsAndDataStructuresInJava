package Drivers;

import ArrayBasedStacks.ArrStack;

public class ArrayStackDriver {
    public static void main(String[] args) {
        ArrStack as = new ArrStack(10);
        as.push(5) ;
        as.push(4);
        as.push(3);
        as.push(2);
        as.push(1);

        as.display();
        System.out.println(as.pop());
        as.display();
    }
}
