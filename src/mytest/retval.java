package mytest;

public class retval {
	public static void main(String[] args) {
		retval test = new retval();
		int zuida = test.getmaxage();
		System.out.println("×î´ó " + zuida);
	}

	public int getmaxage() {
		int[] age = { 18, 23, 21, 19, 25, 29, 17 };
		int max = 0;
		for (int i = 0; i < age.length; i++) {
			if (max < age[i]) {
				max = age[i];
			}
		}
		return max;
	}
}

