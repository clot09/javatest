package mytest;

public class test3 {
	public static void main(String[] args) {
		test3 test = new test3();
		int scores[] = { 20, 30 };
		double avgsc = test.calcavg(scores);
		System.out.println("the avg score is :" + avgsc);
	}

	public double calcavg(int[] scores) {
		int sum = 0;
		for (int i = 0; i < scores.length; i++) {
			sum = sum + scores[i];
		}
		double avg = sum / scores.length;
		return avg;
	}

}
