package LetterCasePermutation;

import java.util.ArrayList;
import java.util.List;

public class LetterCasePermutation {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "a1b2";
        String s1 = "3z4";
        String s2 = "12345";
        System.out.println(solution.letterCasePermutation(s));
        System.out.println(solution.letterCasePermutation(s1));
        System.out.println(solution.letterCasePermutation(s2));
    }
}

class Solution {
    List<String> letterCasePermutation(String S) {
        List<String> ans = new ArrayList<>();
        ans.add(S);
        for (int i = 0; i < S.length(); i++) {
            if (Character.isDigit(S.charAt(i)))
                continue;
            if (Character.isLowerCase(S.charAt(i))) {
                List<String> newList = new ArrayList<>();
                for (String an : ans) {
                    StringBuilder temp = new StringBuilder(an);
                    char change = Character.toUpperCase(S.charAt(i));
                    temp.setCharAt(i, change);
                    newList.add(temp.toString());
                }
                ans.addAll(newList);
            } else if (Character.isUpperCase(S.charAt(i))) {
                List<String> newList = new ArrayList<>();
                for (String an : ans) {
                    StringBuilder temp = new StringBuilder(an);
                    char change = Character.toLowerCase(S.charAt(i));
                    temp.setCharAt(i, change);
                    newList.add(temp.toString());
                }
                ans.addAll(newList);
            }
        }
        return ans;
    }
}
