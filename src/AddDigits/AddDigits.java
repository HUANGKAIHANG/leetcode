package AddDigits;

public class AddDigits {
    public static void main(String[] args) {
        int num = 38;
        Solution solution = new Solution();
        System.out.println(solution.addDigits(num));
    }
}

class Solution {
    int addDigits(int num) {
        String n = String.valueOf(num);
        while (n.length() != 1) {
            int temp = 0;
            for (int i = 0; i < n.length(); i++)
                temp = temp + Character.getNumericValue(n.charAt(i));
            n = String.valueOf(temp);
        }
        return Integer.parseInt(n);
    }
}
