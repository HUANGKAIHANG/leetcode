package ValidAnagram;

import java.util.Arrays;

public class ValidAnagram {
	public static void main(String[] args) {
		Solution solution = new Solution();
		String s1 = "anagram";
		String t1 = "nagaram";
		String s2 = "rat";
		String t2 = "car";
		System.out.println(solution.isAnagram(s1, t1));
		System.out.println(solution.isAnagram(s2, t2));
	}
}

class Solution {
	boolean isAnagram(String s, String t) {
		char[] ss = s.toCharArray();
		char[] ts = t.toCharArray();
		Arrays.sort(ss);
		Arrays.sort(ts);
		return String.valueOf(ss).equals(String.valueOf(ts));
	}
}