
public class FindTwoMaxNumber {
	public static void main(String[] args) {
		int b[] = { 1, 2, -4, -5, 3 };
		System.out.println(Arrays.toString(getMaxProduct(b)));
	}

	public static int[] getMaxProduct(int b[]) {
		int max = b[0] * b[1];
		int[] arr = new int[2];
		for (int i = 0; i < b.length - 1; i++) {
			for (int j = i + 1; j < b.length; j++) {
				if (max < b[i] * b[j]) {
					max = b[i] * b[j];
					arr[0] = b[i];
					arr[1] = b[j];
				}
			}
		}
		return arr;
	}

}
