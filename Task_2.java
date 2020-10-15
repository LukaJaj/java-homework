package homework;
import java.util.*;


public class Task_2 {
	
	public static int minSplit(int amount) {
		
		int coins[] = { 1, 5, 10, 20, 50 };
		Vector<Integer> ans = new Vector<Integer>();
		
		for (int i = coins.length - 1; i >= 0; i--) {
			while (amount >= coins[i]) {
				amount -= coins[i];
				ans.add(coins[i]);
			}

		}
		return ans.size();

	}
	
	//Runtime Complexity O(N^2)
	//Space Complexity O(N)
}
