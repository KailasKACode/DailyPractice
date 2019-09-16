import java.util.Scanner;

public class MultiplicationOfNumber {
	public static void main(String[] args) {
		System.out.println("Enter the number:  ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int rem = 0;
		int mult = 1;
		while (num != 0) {
			rem = num % 10;
			mult = mult * rem;
			num = num / 10;
		}
		System.out.println(mult);

		multNumbers();

	}

	public static int multNumbers() {
		System.out.println("Enter the number:  ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int rem = 0;
		int mult = 1;
		while (num != 0) {
			rem = num % 10;
			mult = mult * rem;
			num = num / 10;
		}
		System.out.println(mult);
		return mult;

	}

}
