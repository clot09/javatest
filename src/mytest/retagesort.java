package mytest;

import java.util.Arrays;

public class retagesort {
	public static void main(String[] args) {
		retagesort test = new retagesort();
		int zuida = test.getmaxage();
		System.out.println("×î´ó" + zuida);
	}

	public int getmaxage() {
		int age[] = { 18, 23, 21, 19, 25, 29, 17 };
		Arrays.sort(age);
		int max = age[age.length - 1];
		return max;
	}

}
