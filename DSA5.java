package Ass10;

public class DSA5 {
		
		static boolean checkEquality(String s)
		{
			return (s.charAt(0) == s.charAt(s.length() - 1));
		}
		
		static int countSubstringWithEqualEnds(String s)
		{
			int result = 0;
			int n = s.length();
		
			// Starting point of substring
			for (int i = 0; i < n; i++)
		
			// Length of substring
			for (int len = 1; len <= n-i; len++)
		
				// Check if current substring has same
				// starting and ending characters.
				if (checkEquality(s.substring(i, i + len)))
					result++;
		
			return result;
		}
		
		public static void main(String args[])
		{
			String s = "abcab";
			System.out.println(countSubstringWithEqualEnds(s));
		}
	}

