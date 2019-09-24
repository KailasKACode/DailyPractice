import java.util.Scanner;

public class FindOccuranceOfCharecter {
	public static void main(String[] args) {
		System.out.println("Enter the String:  ");
		Scanner sc = new Scanner(System.in);
		String tal = sc.next();
		occuranceOfCharecter(tal);

	}

	public static void occuranceOfCharecter(String tal) {
		for (int i = 0; i < tal.length(); i++) {
			int cnt = 1;
			for (int j = i + 1; j < tal.length() - 1; j++) {
				if (tal.charAt(i) == tal.charAt(j)) {
					cnt++;
				}
			}
			if (tal.charAt(i) != ' ') {

				System.out.println(tal.charAt(i) + "   " + cnt);
				tal = tal.replace(tal.charAt(i), ' ');
			}

		}

	}

}
