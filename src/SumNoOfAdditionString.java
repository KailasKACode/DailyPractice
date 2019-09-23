
public class SumNoOfAdditionString {
	public static void main(String[] args) {
		SumNoOfAdditionString b = new SumNoOfAdditionString();
		b.getAdditon("5g8d6d5v5v5");
		b.getSum("f4f4gg4h4g84d");

	}

	public void getAdditon(String alphanumeric) {
		String str = alphanumeric;
		String a = str.replaceAll("\\D", "");
		System.out.println("Getting String formate number: " + a);
		int sum = 0;
		char[] b = a.toCharArray();
		for (int i = 0; i < b.length; i++) {
			int no = Character.getNumericValue(b[i]);
			sum = no + sum;
		}
		System.out.println("Sum of all integer " + sum);

	}

	public void getSum(String alphanumeric) {
		String str = alphanumeric;
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >= '0' && ch <= '9') {
				sum = sum + str.charAt(i) - 48;

			}

		}
		System.out.println(sum);

	}
}
