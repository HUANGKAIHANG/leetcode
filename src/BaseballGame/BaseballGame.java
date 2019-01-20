package BaseballGame;

import java.util.ArrayList;
import java.util.List;

public class BaseballGame {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] op1 = {"5", "2", "C", "D", "+"};
        String[] op2 = {"5", "-2", "4", "C", "D", "9", "+", "+"};
        System.out.println(solution.calPoints(op1));
        System.out.println(solution.calPoints(op2));
    }
}

class Solution {
    int calPoints(String[] ops) {
        int sum = 0;
        List<Integer> valid = new ArrayList<>();
        for (String op : ops) {
            switch (op) {
                case "+":
                    sum = sum + valid.get(valid.size() - 1) + valid.get(valid.size() - 2);
                    valid.add(valid.get(valid.size() - 1) + valid.get(valid.size() - 2));
                    break;
                case "D":
                    sum = sum + valid.get(valid.size() - 1) * 2;
                    valid.add(valid.get(valid.size() - 1) * 2);
                    break;
                case "C":
                    sum = sum - valid.get(valid.size() - 1);
                    valid.remove(valid.size() - 1);
                    break;
                default:
                    sum = sum + Integer.parseInt(op);
                    valid.add(Integer.parseInt(op));
                    break;
            }
        }
        return sum;
    }
}