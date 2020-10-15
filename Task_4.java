package homework;
import java.util.*;

public class Task_4 {
	public static boolean isProperly(String sequence) {
		
		if (sequence.length() == 0)
			return true;
		
		Stack<Character> chars = new Stack<Character>();
		
		for (int i = 0; i < sequence.length(); i++) {
			if (sequence.charAt(i) == '{' || sequence.charAt(i) == '(' || sequence.charAt(i) == '[') {
				chars.push(sequence.charAt(i));
				continue;
			} 
			else {
				if (!chars.empty()) {
					switch (sequence.charAt(i)) {
					case ')':
						if (chars.peek() == '(') {
							chars.pop();
							continue;
						} else
							return false;
					case ']':
						if (chars.peek() == '[') {
							chars.pop();
							continue;
						} else
							return false;
					case '}':
						if (chars.peek() == '{') {
							chars.pop();
							continue;
						}

					}
				} else
					return false;
			}
		}
		return chars.empty();

	}

	// Runtime Complexity: O(n)
	// Space Complexity: O(n)

}
