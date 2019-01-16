package ShortestDistanceCharacter;

import java.util.Arrays;

public class ShortestDistanceCharacter {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "loveleetcode";
        char c = 'e';
        System.out.println(Arrays.toString(solution.shortestToChar(s, c)));
    }
}

class Solution {
    int[] shortestToChar(String S, char C) {
        String[] ss = S.split(String.valueOf(C));
        int[] distances = new int[S.length()];
        int index = 0;
        for (int i = 0; i < ss.length; i++) {
            for (int j = 0; j < ss[i].length(); j++) {
                if (i == 0)
                    distances[index++] = ss[i].length() - j;
                else if (i == ss.length - 1 && S.charAt(S.length() - 1) != C)
                    distances[index++] = j + 1;
                else
                    distances[index++] = j + 1 < ss[i].length() - j ? j + 1 : ss[i].length() - j;
            }
            if (i != ss.length - 1)
                distances[index++] = 0;
        }
        if (S.charAt(S.length() - 1) == C)
            distances[index++] = 0;
        return distances;
    }
}