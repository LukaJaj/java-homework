package homework;

public class Task_5 {

	public static int countVariants(int stearsCount) {
		if (stearsCount <= 0)
			return 0;
		if (stearsCount <= 2)
			return stearsCount;

		int f_n = 0;
		int f_n_1 = 2, f_n_2 = 1;

		for (int i = 3; i <= stearsCount; i++) {
			f_n = f_n_1 + f_n_2;
			f_n_2 = f_n_1;
			f_n_1 = f_n;
		}

		return f_n;
	}

}
