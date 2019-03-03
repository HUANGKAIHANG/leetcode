package RotatedDigits;

import java.util.ArrayList;
import java.util.List;

public class RotatedDigits {
	public static void main(String[] args) {
		Solution solution = new Solution();
		int N = 857;//857-247
		System.out.println(solution.rotatedDigits(N));
	}
}

class Solution {
	int rotatedDigits(int N) {
		List<Integer> good = new ArrayList<>();
		for (int i = 1; i <= N; i++) {
			if (String.valueOf(i).contains("3") ||
					String.valueOf(i).contains("4") ||
					String.valueOf(i).contains("7"))
				continue;

			StringBuffer temp = new StringBuffer(String.valueOf(i));

			for (int j = 0; j < temp.length(); j++) {
				if (temp.charAt(j) == '2')
					temp.setCharAt(j, '5');
				else if (temp.charAt(j) == '5')
					temp.setCharAt(j, '2');
				else if (temp.charAt(j) == '6')
					temp.setCharAt(j, '9');
				else if (temp.charAt(j) == '9')
					temp.setCharAt(j, '6');
			}
			if (Integer.parseInt(temp.toString()) != i)
				good.add(i);

		}

		return good.size();
	}
}

