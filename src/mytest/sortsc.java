package mytest;

import java.util.Arrays;

public class sortsc {
	public static void main(String[] args) {

		int score[] = new int[] { 89, -23, 64, 91, 119, 52, 73 };
		Arrays.sort(score);
		int[] cc = new int[score.length];

		for (int i = 0; i <= score.length; i++) {
			if (score[i] >= 0 && score[i] <= 100) {
				for (int k = 0; k <= cc.length; k++) {
					cc[k] = score[i];
				}
			}
		}
		System.out.println(Arrays.toString(cc));

	}
}
