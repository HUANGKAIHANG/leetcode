package RomanInteger;

import java.util.ArrayList;
import java.util.List;

public class RomanInteger {
	public static void main(String[] args) {
		Solution solution = new Solution();
		String s1="III";
		String s2="IV";
		String s3="IX";
		String s4="LVIII";
		String s5="MCMXCIV";
		System.out.println(solution.romanToInt(s1));
		System.out.println(solution.romanToInt(s2));
		System.out.println(solution.romanToInt(s3));
		System.out.println(solution.romanToInt(s4));
		System.out.println(solution.romanToInt(s5));
	}
}

class Solution {
	int romanToInt(String s) {
		int ans = 0;
		List<Character> list = new ArrayList<>();
		char current = 0;
		for (int i = 0; i < s.length(); i++) {
			if (list.size()==0) {
				current = s.charAt(i);
				list.add(current);
			} else if (current==s.charAt(i)){
				list.add(s.charAt(i));
			} else if (current!=s.charAt(i)&&getValue(current)>getValue(s.charAt(i))){
				ans = ans + list.size()*getValue(current);
				current=s.charAt(i);
				list.clear();
				list.add(current);
			}else if (current!=s.charAt(i)&&getValue(current)<getValue(s.charAt(i))){
				ans = ans + getValue(s.charAt(i))-getValue(current);
				list.clear();
			}
		}
		ans = ans + list.size()*getValue(current);
		return ans;
	}
	private int getValue(char s){
		int val = 0;
		switch (s) {
			case 'I':
				val= 1;
				break;
			case 'V':
				val= 5;
				break;
			case 'X':
				val= 10;
				break;
			case 'L':
				val= 50;
				break;
			case 'C':
				val= 100;
				break;
			case 'D':
				val= 500;
				break;
			case 'M':
				val= 1000;
				break;
		}
		return val;
	}
}

/*
		Symbol       Value
		I             1
		V             5
		X             10
		L             50
		C             100
		D             500
		M             1000      */
