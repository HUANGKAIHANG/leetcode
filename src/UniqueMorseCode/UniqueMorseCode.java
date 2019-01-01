package UniqueMorseCode;

import java.util.HashSet;
import java.util.Set;

public class UniqueMorseCode {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] words = {"gin", "zen", "gig", "msg"};
        System.out.println(solution.uniqueMorseRepresentations(words));
    }
}

class Solution {
    int uniqueMorseRepresentations(String[] words) {
        Set<String> s = new HashSet<>();
        String[] morseCode = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--"
                , "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        for (String word : words) {
            char[] chars = word.toCharArray();
            StringBuffer morse = new StringBuffer();
            for (char aChar : chars) {
                morse.append(morseCode[(byte) aChar - 97]);
            }
            s.add(morse.toString());
        }
        return s.size();
    }
}
