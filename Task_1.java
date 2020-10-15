package homework;

public class Task_1 {

	public static boolean isPalindrome(String word) {

		for (int i = 0, j = word.length() - 1; i < j; i++, j--) {
			if (word.charAt(i) != word.charAt(j)) {
				return false;
			}
		}

		return true;

	}
	// Runtime Complexity: O(n)

}
