
public class FindTwoMaxNumber {
	public static void main(String[] args) {
		int a[] = { 99, 6, 3, 8, 9, 2, 15, 58, 59, 95 };
		int firstlarge = 0;
		int secondlarge = 1;
		for (int i = 0; i < a.length; i++) {
			if (firstlarge < a[i]) {
				secondlarge = firstlarge;
				firstlarge = a[i];

			} else if (secondlarge < a[i]) {
				secondlarge = a[i];
			}
		}
		int product = firstlarge * secondlarge;

		System.out.println(firstlarge + "  " + secondlarge + "  Largest two products are: " + product);
		int b[] = { 4, 9, 6, 7, 2, 3, 8 };
		productMbx(b);
	}

	public static void productMbx(int b[]) {
		int firstlbrge = 0;
		int secondlbrge = 1;
		for (int i = 0; i < b.length; i++) {
			if (firstlbrge < b[i]) {
				secondlbrge = firstlbrge;
				firstlbrge = b[i];

			} else if (secondlbrge < b[i]) {
				secondlbrge = b[i];
			}
		}
		int product = firstlbrge * secondlbrge;

		System.out.println(firstlbrge + "  " + secondlbrge + "  Largest two products are:" + product);

	}

}
