package FizzBuzz;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int n = 15;
        System.out.println(solution.fizzBuzz(n));
    }
}

class Solution {
    List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 5 == 0 && i % 3 == 0)
                list.add("FizzBuzz");
            else if (i % 5 == 0)
                list.add("Buzz");
            else if (i % 3 == 0)
                list.add("Fizz");
            else
                list.add(String.valueOf(i));
        }
        return list;
    }
}