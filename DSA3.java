package Ass10;

public class DSA3 {

		static void powerSet(String str, int index, String curr)
		{
			int n = str.length();

			// base case
			if (index == n) {
				return;
			}

			// First print current subset
			System.out.println(curr);

			// Try appending remaining characters
			// to current subset
			for (int i = index + 1; i < n; i++) {
				curr += str.charAt(i);
				powerSet(str, i, curr);

			
				curr = curr.substring(0, curr.length() - 1);
			}
		}

		public static void main(String[] args)
		{
			String str = "abc";
			int index = -1;
			String curr = "";
			powerSet(str, index, curr);
		}
	}
