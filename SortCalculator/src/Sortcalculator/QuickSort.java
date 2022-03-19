package Sortcalculator;

import java.util.Arrays;
import java.util.Scanner;

class Quicksort extends FirstPage {
	void quicksort() {
		int c, i;
		Scanner scan = new Scanner(System.in);
		System.out.println("Input number : ");
		n = scan.nextInt();
		System.out.println("Input list : ");
		for (i = 0; i < n; i++) {
			x[i] = scan.nextInt();
		}
		 System.out.println("\n");
		System.out.println(">>>>>>>>>Quick sort main menu<<<<<<<<");
		System.out.println("Choose ascending order or deasending order");
		System.out.println(" Press 1 for Ascending order");
		System.out.println(" Press 2 for Descending order");
		System.out.println(" press 0 for exit ");
		System.out.println(" Enter your choosing number : ");
		Quicksort.quicksort(x, 0, n - 1);
		b = scan.nextInt();
		switch (b) {
		case 1:
			System.out.println("Asscending order : ");

			for (i = 0; i < n; i++) {
				System.out.print(" " + x[i]);
			}
			break;

		case 2:
			System.out.println("Desscending order : ");
			for (i = n-1; i >= 0; i--) {
				System.out.print(" " + x[i]);
			}
			break;
		}
		System.out.println("\n");
		System.out.println("press 0 and  exit quick sort: ");
		b = scan.nextInt();
		if (b == 0) {
			System("cls");
			Object args = null;
			main(args);
		}
	}
   static void quicksort(int x[], int first, int end) {
	int temp, k = first, j = end, p = x[(first + end) / 2];
   	while (k <= j) {
			while (x[k] < p)
				k++;
			while (x[j] > p)
				j--;

			if (k <= j) {
				temp = x[k];
				x[k] = x[j];
				x[j] = temp;
				k++;
				j--;
			}}

		if (first < j) {
			quicksort(x, first, j);	}

		if (end > k) {
			quicksort(x, k, end);
		}
	}

	private void main(Object args) {}

	private void System(String string) {}

}
