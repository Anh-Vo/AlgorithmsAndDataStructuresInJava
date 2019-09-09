package Apps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseApp {
    public static void main(String[] args) throws IOException {
        String input, output;
        while(true) {
            System.out.println("Enter a string: ");
            input = getString();
            if(input.equals("")) {
                break;
            }
            Reverser rapp = new Reverser(input);
            output = rapp.reverse();
            System.out.println("Reversed: " + output);
        }
    }

    public static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }
}
