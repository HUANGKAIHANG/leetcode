package UncommonWordsTwoSentences;

import java.util.*;

public class UncommonWordsTwoSentences {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String A = "this apple is sweet";
        String B = "this apple is sour";
        String A1 = "apple apple";
        String B1 = "banana";
        System.out.println(Arrays.toString(solution.uncommonFromSentences(A, B)));
        System.out.println(Arrays.toString(solution.uncommonFromSentences(A1, B1)));
    }
}

class Solution {
    String[] uncommonFromSentences(String A, String B) {
        Map<String, Integer> mapA = new HashMap<>();
        Map<String, Integer> mapB = new HashMap<>();
        String[] as = A.split(" ");
        String[] bs = B.split(" ");
        List<String> ans = new ArrayList<>();
        fullMap(mapA, as);
        fullMap(mapB, bs);
        for (Map.Entry<String, Integer> entry : mapA.entrySet()) {
            if (entry.getValue() == 1 && !mapB.containsKey(entry.getKey()))
                ans.add(entry.getKey());
        }
        for (Map.Entry<String, Integer> entry : mapB.entrySet()) {
            if (entry.getValue() == 1 && !mapA.containsKey(entry.getKey()))
                ans.add(entry.getKey());
        }
        return ans.toArray(new String[0]);
    }

    private void fullMap(Map<String, Integer> map, String[] s) {
        for (String a : s) {
            if (!map.containsKey(a))
                map.put(a, 1);
            else
                map.put(a, map.get(a) + 1);
        }
    }
}
//其实一个map就够了。。。