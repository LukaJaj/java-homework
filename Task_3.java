package homework;

public class Task_3 {
	
	public static void bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {

					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;

				}

			}
		}
	}
	
	public static int notContains(int[] array) {
		bubbleSort(array);

		int start = 0;
		int end = array.length - 1;
		int answer = array[0] + 1;

		while (start <= end) {

			int mid = (start + end) / 2;

			if (array[mid] <= answer) {
				if (array[mid] == answer) {
					answer++;
					end = array.length - 1;
				}
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}

		return answer;
	}


	public static void printArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
