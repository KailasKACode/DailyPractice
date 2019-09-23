
public class FindTwoMaxNumber {
	public static void main(String[] args)  {
		int b[] = { 4, 9, 6, 7, 2, 3, 8, 96 };
		productMbx(b);
	}

	public static int[] productMbx(int b[]) {
		int firstlarge = 0;
		int secondlarge = 1;
		for (int i = 0; i < b.length; i++) {
			if (firstlarge < b[i]) {
				secondlarge = firstlarge;
				firstlarge = b[i];
			} else if (secondlarge < b[i]) {
				secondlarge = b[i];
			}
		}
		int product = firstlarge * secondlarge;

		System.out.println(firstlarge + "  " + secondlarge + "  Largest two products are:" + product);
		return b;

	}

}
