package Sortcalculator;
import java.util.Scanner;
public class Main {
public static void main(String[] args) {
	 int t;
		Scanner scan = new Scanner(System.in);
		BubbleSort s1=new BubbleSort();
		SelectionSort s3=new SelectionSort();
		Quicksort s2=new Quicksort();
        MargeSort s4=new MargeSort();
       RadixSort s5=new RadixSort();
	while(true) {
	   	System.out.println(">>>>>>>>>Sort calculator main menu<<<<<<<<");
		System.out.println("Choose any sort");
		System.out.println(" Press 1 for Bubble sort");
		System.out.println(" Press 2 for Selection sort");
		System.out.println(" Press 3 for Marge sort");
		System.out.println(" Press 4 for Quick sort");
		System.out.println(" Press 5 for Radix sort");
		System.out.println(" press 0 for exit ");
		System.out.println(" Enter  choosing any  number : ");
		
		t=scan.nextInt();
		switch(t) {
		case 1:
			 s1.BubbleSort();
			 break;
		case 2:	 
			 s3.SelectionSort();
			 break;
		case 3:
			 s4.marge();
			 break;
		case 4:	 
			 s2.quicksort();;
			 break;
		case 5:
			s5.Radix();
			break;
		case 0:
			System.exit(0);
			break;
		default:
            System.out.println("Please select an option.");
		}
       System.out.println("\n");
	}
}	}

