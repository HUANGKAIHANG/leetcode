package DIStringMatch;

import java.util.Arrays;

public class DIStringMatch {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String di1 = "IDID";
        String di2 = "III";
        String di3 = "DDI";
        System.out.println(Arrays.toString(solution.diStringMatch(di1)));
        System.out.println(Arrays.toString(solution.diStringMatch(di2)));
        System.out.println(Arrays.toString(solution.diStringMatch(di3)));
    }
}

class Solution {
    int[] diStringMatch(String S) {
        int[] di = new int[S.length() + 1];
        for (int i = 0; i <= S.length(); i++)
            di[i] = i;
        boolean flag = true;
        while (flag) {
            int i;
            for (i = 0; i < S.length(); i++) {
                if (S.charAt(i) == 'D' && di[i] < di[i + 1])
                    break;
                else if (S.charAt(i) == 'I' && di[i] > di[i + 1])
                    break;
            }
            if (i == S.length())
                flag = false;
            if (flag)
                for (int j = 0; j < S.length(); j++)
                    if (S.charAt(j) == 'D'&&di[j]<di[j+1]) {
                        int temp = di[j];
                        di[j] = di[j + 1];
                        di[j + 1] = temp;
                    }
        }
        return di;
    }
}
