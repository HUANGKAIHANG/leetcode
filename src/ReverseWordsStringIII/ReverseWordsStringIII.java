package ReverseWordsStringIII;

public class ReverseWordsStringIII {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "Let's take LeetCode contest";
        System.out.println(solution.reverseWords(s));
    }
}

class Solution {
    String reverseWords(String s) {
        String[] words = s.split(" ");
        for (int i = 0; i < words.length; i++) {
            char[] newWord = new char[words[i].length()];
            for (int j = 0; j < newWord.length; j++)
                newWord[j] = words[i].charAt(newWord.length - 1 - j);
            words[i] = String.valueOf(newWord);
        }
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            if (i == words.length - 1)
                ans.append(words[i]);
            else
                ans.append(words[i]).append(" ");
        }
        return ans.toString();
    }
}
