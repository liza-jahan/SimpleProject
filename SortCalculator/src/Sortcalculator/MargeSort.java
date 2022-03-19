package Sortcalculator;

import java.util.Arrays;
import java.util.Scanner;
public class MargeSort extends FirstPage {
	void marge() {
		int num;
     	Scanner scan = new Scanner(System.in);
		System.out.println("Input number : ");
		n = scan.nextInt();
		System.out.println("Input list : ");
        for (i = 0; i < n; i++) {
			x[i] = scan.nextInt();
		}
		 System.out.println("\n");
		System.out.println(">>>>>>>>Marge sort main menu<<<<<<<<");
		System.out.println("Choose ascending order or deasending order");
		System.out.println(" Press 1 for Ascending order");
		System.out.println(" Press 2 for Descending order");
		System.out.println(" press 0 for exit ");
		System.out.println(" Enter your choosing number : ");
        MargeSort.merge_sort(x, 0, n - 1);
		b = scan.nextInt();
		switch (b) {
		case 1:
			System.out.println("Ascending order array\n");
			for (int i = 0; i < n; i++) {
				System.out.print(" " + x[i]);
			}
			break;
          case 2:
			System.out.println("Descending order array\n");
			for (int i = n - 1; i >= 0; i--) {
				System.out.print(" " + x[i]);
			}
			break;
		}
		System.out.println("\n");
		System.out.println("press 0 and  exit marge sort: ");
		b = scan.nextInt();
		if (b == 0) {
			System("cls");
			Object args = null;
			main(args);
		}

	}

	static void merge_sort(int x[], int low, int high) {
		int mid;
		if (low < high) {
		
			mid = (low + high) / 2;
			merge_sort(x, low, mid);
			merge_sort(x, mid + 1, high);
			// merge or conquer sorted arrays
			merge(x, low, high, mid);
		}
	}

	// Merge sort
	static void merge(int x[], int low, int high, int mid) {
		int i, j, k;
		int c[] = new int[50];
		i = low;
		k = low;
		j = mid + 1;
		while (i <= mid && j <= high) {
			if (x[i] < x[j]) {
				c[k] = x[i];
				k++;
				i++;
			} else {
				c[k] = x[j];
				k++;
				j++;
			}
		}
		while (i <= mid) {
			c[k] = x[i];
			k++;
			i++;
		}
		while (j <= high) {
			c[k] = x[j];
			k++;
			j++;
		}
		for (i = low; i < k; i++) {
			x[i] = c[i];
		}	}

	private void main(Object args) {}

	private void System(String string) {}
}

