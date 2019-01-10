package FibonacciNumber;

public class FibonacciNumber {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.fib(2));
        System.out.println(solution.fib(3));
        System.out.println(solution.fib(4));
    }
}

class Solution {
    int fib(int N) {
        int f0 = 0;
        int f1 = 1;
        if (N == 0)
            return f0;
        else if (N == 1)
            return f1;
        else {
            int count = N - 1;
            while (count != 0) {
                int temp = f1;
                f1 = f0 + f1;
                f0 = temp;
                count--;
            }
            return f1;
        }
    }
}