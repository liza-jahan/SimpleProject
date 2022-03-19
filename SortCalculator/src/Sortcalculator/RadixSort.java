package Sortcalculator;

import java.util.Scanner;

public class RadixSort extends FirstPage {

	void Radix() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Input number : ");
		n = scan.nextInt();
		System.out.println("Input list : ");
		for (i = 0; i < n; i++) {
			x[i] = scan.nextInt();
		}
		 System.out.println("\n");
		System.out.println(">>>>>>>>>Radix sort main menu<<<<<<<<");
		System.out.println("Choose ascending order or deasending order");
		System.out.println(" Press 1 for Ascending order");
		System.out.println(" Press 2 for Descending order");
		System.out.println(" press 0 for exit ");
		System.out.println(" Enter your choosing number : ");

		radixsort(x, n);
		b = scan.nextInt();
		// print(x, n,b);
		switch (b) {
		case 1:
			System.out.println("Ascending order : ");
			for (i = 0; i < n; i++) {
				System.out.print(" " + x[i]);
			}
			break;
		// System.out.print("\n");
		case 2:
			System.out.println("Descending order : ");
			for (i = n - 1; i >= 0; i--) {
				System.out.print(" " + x[i]);
			}
			break;
		}
		System.out.println("\n");
		System.out.println("press 0 and  exit radix sort: ");
		b = scan.nextInt();
		if (b == 0) {
			System("cls");
			Object args = null;
			main(args);
		}}
	static int getMax(int x[], int n) {
		int mx = x[0];
		for (int i = 1; i < n; i++)
			if (x[i] > mx)
				mx = x[i];
		return mx;
	}
	static void countSort(int x[], int n, int exp) {
		int output[] = new int[n]; 
		int i, count[] = new int[50];

		for (i = 0; i < n; i++)
			count[(x[i] / exp) % 10]++;

		for (i = 1; i < 10; i++)
			count[i] += count[i - 1];

		
		for (i = n - 1; i >= 0; i--) {
			output[count[(x[i] / exp) % 10] - 1] = x[i];
			count[(x[i] / exp) % 10]--;
		}
		for (i = 0; i < n; i++)
			x[i] = output[i];
	}
static void radixsort(int x[], int n) {

		int m = getMax(x, n);

		for (int exp = 1; m / exp > 0; exp *= 10)
			countSort(x, n, exp);}

	private void main(Object args) {}

	private void System(String string) {}

	
}
