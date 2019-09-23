
public class FindOccuranceOfCharecter {
	public static void main(String[] args) {
		String tal = "tajmahaaal";
		int cnt = 0;
		char d = 0;

		for (int i = 0; i < tal.length(); i++) {
			for (int j = i; j < tal.length(); j++) {
				if (tal.charAt(i) == tal.charAt(j)) {
					d = tal.charAt(i);
					cnt=d+cnt;

				}
			}
			System.out.println(cnt + "   " + i);

		}

	}

}
