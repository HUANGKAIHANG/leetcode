package NimGame;

public class NimGame {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int n = 4;
        System.out.println(solution.canWinNim(n));
    }
}

class Solution {
    boolean canWinNim(int n) {
        return n % 4 != 0;
    }
}
