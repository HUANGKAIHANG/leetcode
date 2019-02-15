package VerifyingAlienDictionary;

public class VerifyingAlienDictionary {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] words1 = {"hello", "leetcode"};
        String order1 = "hlabcdefgijkmnopqrstuvwxyz";
        String[] words2 = {"word", "world", "row"};
        String order2 = "worldabcefghijkmnpqstuvxyz";
        String[] words3 = {"apple", "app"};
        String order3 = "abcdefghijklmnopqrstuvwxyz";
        System.out.println(solution.isAlienSorted(words1, order1));
        System.out.println(solution.isAlienSorted(words2, order2));
        System.out.println(solution.isAlienSorted(words3, order3));
    }
}

class Solution {
    boolean isAlienSorted(String[] words, String order) {
        boolean result = true;
        for (int i = 0; i < words.length - 1; i++) {
            if (!smaller(words[i], words[i + 1], order)) {
                result = false;
                break;
            }
        }
        return result;
    }

    private boolean smaller(String word1, String word2, String order) {
        boolean small = true;
        int min = word1.length() > word2.length() ? word2.length() : word1.length();
        int i;
        for (i = 0; i < min; i++) {
            int index1 = order.indexOf(String.valueOf(word1.charAt(i)));
            int index2 = order.indexOf(String.valueOf(word2.charAt(i)));
            if (index1 > index2) {
                small = false;
                break;
            } else if (index1 < index2) {
                break;
            }
        }
        if (i == min && word1.length() != min)
            small = false;
        return small;
    }
}