package mytest;

import java.util.Scanner;

public class avgclass {
	public static void main(String[] args) {
		int classnum = 3; // class num is 3
		int stunum = 4; // every class has 4 students
		double sum_score = 0;
		double avg_score = 0;
		Scanner input = new Scanner(System.in);
		for (int i = 1; i < classnum; i++) {
			System.out.println("please input the " + i + "class scores");
			for (int j = 1; j <= stunum; j++) {
				System.out.println("please input the " + j + "student scores");
				int score = input.nextInt();
				sum_score = sum_score + score;
			}
			avg_score = sum_score / stunum;
			System.out.println("the sum score of " + i + "class is " + sum_score);
			System.out.println("the avg score of " + i + "class is " + avg_score);
		}
	}
}
