package mytest;

import java.util.Scanner;

public class scoreadd {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("input the score");
		int score = input.nextInt();
		int count = 0;
		System.out.println("加分前的成绩:" + score);
		while (score < 60) {
			score++;
			count++;
		}
		System.out.println(score);
		System.out.println(count);

	}
}
