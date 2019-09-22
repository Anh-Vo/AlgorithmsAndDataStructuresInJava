package Iterative;

public class TriangleIterative {

    public int calculate(int n) {
        int sum = 0;

        while(n > 0) {
            sum += n--;
        }
        return sum;
    }
}
