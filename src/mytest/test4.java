package mytest;

import java.util.Arrays;
import java.util.Scanner;

public class test4 {
	public static void main(String[] args) {
		test4 testarry = new test4();
		System.out.println("please input the length of arrys");
		Scanner input = new Scanner(System.in);
		int vale = input.nextInt();

		System.out.println("you input the length is :" + vale);
		int[] arys = testarry.print(vale);
		System.out.println(Arrays.toString(arys));
	}

	public int[] print(int len) {
		int[] num = new int[len];
		for (int i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random() * 100);
		}
		return num;
	}

}
