package FindDifference;

public class FindDifference {
	public static void main(String[] args) {
		Solution solution = new Solution();
		String s = "abcd";
		String t = "abcde";
		System.out.println(solution.findTheDifference(s, t));
	}
}

class Solution {
	char findTheDifference(String s, String t) {
		char[] ss = s.toCharArray();
		char[] ts = t.toCharArray();
		int diff = 0;
		for (char temp : ts)
			diff = diff + temp;
		for (char temp : ss)
			diff = diff - temp;
		return (char) diff;
	}
}
