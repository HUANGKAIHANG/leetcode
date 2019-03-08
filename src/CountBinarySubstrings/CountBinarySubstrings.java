package CountBinarySubstrings;

import java.util.ArrayList;
import java.util.List;

public class CountBinarySubstrings {
	public static void main(String[] args) {
	    Solution solution = new Solution();
	    String s = "00110011"; // 2 2 2 2
	    String s1 = "10101"; // 1 1 1 1 1
	    String s2 = "01"; // 1 1
	    System.out.println(solution.countBinarySubstrings(s));
	    System.out.println(solution.countBinarySubstrings(s1));
	    System.out.println(solution.countBinarySubstrings(s2));
	}
}

class Solution {
	int countBinarySubstrings(String s) {
		int count=1;
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < s.length()-1; i++) {
			if (s.charAt(i)==s.charAt(i+1))
				count++;
			else{
				list.add(count);
				count=1;
			}
		}
		list.add(count);
		int ans = 0;
		for (int i = 0; i < list.size()-1; i++)
			ans=ans+Math.min(list.get(i),list.get(i+1));

		return ans;
	}

}
