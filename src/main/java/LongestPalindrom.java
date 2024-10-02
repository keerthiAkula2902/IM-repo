
public class LongestPalindrom {

	public static void main(String[] args) {
		String str = "abaabcaab";
		int low, high;
		String Palindrome = "", lps = "";
		for (int i = 1; i < str.length(); i++) {
			// odd
			low = i;
			high = i;
			while (str.charAt(low) == str.charAt(high)) {
				low--;
				high++;
				if (low < 1 || high >= str.length()) {
					break;
				}
			}
			Palindrome = str.substring(low + 1, high);
			if (Palindrome.length() > lps.length()) {
				lps = Palindrome;
			}
			// even
			low = i-1;
			high = i;
			while (str.charAt(low) == str.charAt(high)) {
				low--;
				high++;
				if (low < 1 || high >= str.length()) {
					break;
				}
			}
			Palindrome = str.substring(low + 1, high);
			if (Palindrome.length() > lps.length()) {
				lps = Palindrome;
			}

		}
		System.out.println(lps);
	}

}
