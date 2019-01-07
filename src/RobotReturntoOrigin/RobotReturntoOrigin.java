package RobotReturntoOrigin;

public class RobotReturntoOrigin {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String moves = "UD";
        System.out.println(solution.judgeCircle(moves));
        moves = "LL";
        System.out.println(solution.judgeCircle(moves));
    }
}

class Solution {
    boolean judgeCircle(String moves) {
        int[] origin = {0, 0};
        for (int i = 0; i < moves.length(); i++) {
            switch (moves.charAt(i)) {
                case 'R':
                    origin[0]++;
                    break;
                case 'L':
                    origin[0]--;
                    break;
                case 'U':
                    origin[1]++;
                    break;
                case 'D':
                    origin[1]--;
                    break;
            }
        }
        return origin[0] == 0 && origin[1] == 0;
    }
}
