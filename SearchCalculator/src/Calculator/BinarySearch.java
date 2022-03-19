 
package Calculator;
// Binary Search
import java.util.*;

public class BinarySearch {
        int x;
	 void binary() {
		 int count, num, item, array[], first, last, middle;
		 Scanner input = new Scanner(System.in);
	      System.out.print("Input number : ");
	      num = input.nextInt(); 
          array = new int[num];
          System.out.print("Enter " + num + " integers : ");
	      for (count = 0; count < num; count++)
	      {
	    	  array[count] = input.nextInt();
	      }
	      System.out.print("\n");
	      System.out.println(">>>>>>>>>Binary search main menu<<<<<<<<");
	      System.out.println("Choose ascending order or deasending order");
			System.out.println(" Press 1 for Ascending order");
			System.out.println(" Press 2 for Descending order");
			System.out.println(" press 0 for exit ");
			System.out.println(" Enter your choosing number : ");
			x=input.nextInt();
			
			switch(x)
			{ 
			
			case 1:
		       Arrays.sort(array);
		    System.out.print("For Binary Search the shorted list is asending oder : ");
		  for (count = 0; count < num; count++)
	       {
			System.out.print(array[count] + " ");
	        }
            System.out.print("\nSearch value: ");
	       item = input.nextInt();
	       first = 0;
	       last = num - 1;
	      middle = (first + last)/2;
           while( first <= last )
	      {
	         if ( array[middle] < item )
	           first = middle + 1;
	         else if ( array[middle] == item )
	         {
	           System.out.println(item + " found at location " + (middle + 1) + ".");
	           break;
	         }
	         else
	         {
	             last = middle - 1;
	        
				 
	         }
			 middle = (first + last)/2;
			
	      }
	      if ( first > last )
	          System.out.println(item + " is not found.\n");
	         break;
			case 2:
                   for (int i=0;i<num;i++){
					  for(int j=0;j<num-i-1;j++){
						  if(array[j]<array[j+1]){
							  int temp = array[j];
							  array[j] = array[j+1];
							  array[j+1] = temp;
						  }
					  }
				  }
				  
				  System.out.print("For Binary Search the shorted list is descending order : ");
				  for (count = 0; count < num; count++)
			      {
					System.out.print(array[count] + " ");
			      }
                  System.out.print("\nSearch value: ");
			      item = input.nextInt();
			      first = 0;
			      last = num - 1;
			      middle = (first + last)/2;

			      while( first <= last )
			      {
			         if ( array[middle] > item )
			           first = middle + 1;
			         else if ( array[middle] == item )
			         {
			           System.out.println(item + " found at location " + (middle + 1) + ".");
			           break;
			         }
			         else
			         {
			             last = middle - 1;
			          }
					 middle = (first + last)/2;	 
			      }
			      if ( first > last )
			          System.out.println(item + " is not found.\n");
			   
			         break;
			
			}
			 System.out.println("press 0 and  exit binary search: ");
			    x=input.nextInt();
			    if(x==0)
			    {
			    	   System("cls");	
			    	   Object args = null;
					main(args);
			    }
				
}
	private void main(Object args) {
		
	}
	private void System(String string) {
		
	}
	 
}	   
	   



