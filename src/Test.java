
public class Test {
	public static void main(String[] args) {
		String b = "driveaaaaaaaaarbbbbr";
		char a[] = b.toCharArray();
		int temp = 0;
		for (int i = 0; i < a.length - 1; i++) {
			if (a.length == 'b')
				temp++;

		}
		System.out.println("Occurance  " + temp);
	}

}