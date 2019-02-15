package ReverseOnlyLetters;

import java.util.*;

public class ReverseOnlyLetters {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s1 = "ab-cd";
        String s2 = "a-bC-dEf-ghIj";
        String s3 = "Test1ng-Leet=code-Q!";
        System.out.println(solution.reverseOnlyLetters(s1));
        System.out.println(solution.reverseOnlyLetters(s2));
        System.out.println(solution.reverseOnlyLetters(s3));
    }
}

class Solution {
    String reverseOnlyLetters(String S) {
        StringBuffer sb = new StringBuffer();
        char[] letters = S.toCharArray();
        Map<Integer, Character> m = new HashMap();
        List<Integer> l = new ArrayList<>();
        LinkedList<Character> q = new LinkedList<>();
        for (int i = 0; i < letters.length; i++) {
            if (((byte) letters[i] >= 65 && (byte) letters[i] <= 90) ||
                    ((byte) letters[i] >= 97 && (byte) letters[i] <= 122))
                q.addFirst(letters[i]);
            else {
                l.add(i);
                m.put(i, letters[i]);
            }
        }
        for (int i = 0; i < S.length(); i++) {
            if (l.contains(i))
                sb.append(m.get(i));
            else
                sb.append(q.poll());
        }
        return sb.toString();
    }
}
