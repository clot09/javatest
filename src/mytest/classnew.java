package mytest;

import java.util.Arrays;

public class classnew {
	public static void main(String[] args) {
		classnew acc = new classnew();
		int scores[] = { 89, -23, 64, 91, 119, 52, 73 };
	 	int[] bb = acc.idsc(scores);
		System.out.println(Arrays.toString(bb));
	}

	public int[] idsc(int[] sc) {

		int[] score = { 89, -23, 64, 91, 119, 52, 73 };
      System.out.println(score.length);
		int[] cc = new int[score.length];
		 System.out.println(cc.length);
		 
		 for (int i = 0; i < score.length; i++) {
			 if (score[i] >= 0 && score[i] <= 100) {
					cc[i] = score[i];
 				}
				Arrays.sort(cc);
		}

		return cc;
	}
}
