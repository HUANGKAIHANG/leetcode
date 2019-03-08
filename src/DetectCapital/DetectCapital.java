package DetectCapital;

public class DetectCapital {
	public static void main(String[] args) {
		Solution solution = new Solution();
		String word1 = "USA";
		String word2 = "FlaG";
		System.out.println(solution.detectCapitalUse(word1));
		System.out.println(solution.detectCapitalUse(word2));
	}
}

class Solution {
	boolean detectCapitalUse(String word) {
		boolean ans = true;
		int first = (int) word.charAt(0);
		if (first - 65 >= 0 && first - 65 <= 25) {
			String next = word.substring(1);
			if (!(next.toLowerCase().equals(next) || next.toUpperCase().equals(next)))
				ans = false;
		} else {
			for (int i = 1; i < word.length(); i++) {
				int temp = (int) word.charAt(i);
				if (temp - 65 >= 0 && temp - 65 <= 25) {
					ans = false;
					break;
				}
			}
		}
		return ans;
	}
}
