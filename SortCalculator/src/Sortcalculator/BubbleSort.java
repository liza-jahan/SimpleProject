package Sortcalculator;

import java.util.Scanner;

public class BubbleSort extends FirstPage{


	void BubbleSort() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Input number : ");
		n=scan.nextInt();
		System.out.println("Input list : ");
	
		for(i=0;i<n;i++) 
		{
		x[i] =scan.nextInt();
		}
		 System.out.println("\n");
		System.out.println(">>>>>>>>>Bubble sort main menu<<<<<<<<");
		System.out.println("Choose ascending order or deasending order");
		System.out.println(" Press 1 for Ascending order");
		System.out.println(" Press 2 for Descending order");
		System.out.println(" press 0 for exit ");
		System.out.println(" Enter your choosing number : ");
         
	
		for(i=0;i<n-1;i++) 
		{
			for( int j=0;j<n-1;j++)
			{
		      if(x[j]>x[j+1])
	     	 {
		       b=x[j+1];
		       x[j+1]=x[j];
		       x[j]=b;
		    
	         }
			}
		}
		 b= scan.nextInt();
		 switch(b)
		{
		 case 1:
			 System.out.println("Asscending order : ");
		
		for(i=0;i<n;i++) {	
		System.out.print(" "+x[i]);
		}
		break;
		
		 case 2:
		System.out.println("Desscending order : ");
		for(i=n-1;i>=0;i--)
		{
		   System.out.print(" "+x[i]);	
		}
		break;
		}
		 System.out.println("\n");
			System.out.println("press 0 and  exit bubble sort : ");
			b = scan.nextInt();
			if (b == 0) {
				System("cls");
				Object args = null;
				main(args);
			}}

	private void main(Object args) {}

	private void System(String string) {
	}}
