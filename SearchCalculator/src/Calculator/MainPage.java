package Calculator;

import java.util.Scanner;

public class MainPage {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a;
		BinarySearch s1 = new BinarySearch();
		LinearSearch s2 = new LinearSearch();
		while (true) {

			System.out.println("\"..............Menu............\\n\" ");
			System.out.println(" Press 1 for linear search");
			System.out.println(" Press 2 for binary search");
			System.out.println(" press 0 for exit ");
			System.out.println(" Enter your choosing number : ");
			a = scan.nextInt();
			switch (a) {
			case 0:
				System.exit(0);
				break;

			case 1:
				s2.Linear();
				break;
			case 2:
				s1.binary();
				break;
			default:
				System.out.println("Please select an option.");
			}
			System.out.print("\n");
		}
	}
}
