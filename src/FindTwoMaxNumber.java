
public class FindTwoMaxNumber {
	public static void main(String[] args) {
		int a[] = { 99, 6, 3, 8, 9, 2, 15, 58, 8, 59, 95, 105 };
		int temp = 0;
		int i = 0;
		int j = 1;
		for (; i < a.length; i++) {
			for (; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}

				System.out.println(a[j]);
			}

		}
	}

}
