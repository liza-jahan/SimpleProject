package Calculator;
//Linear Search 
import java.util.Scanner;

public class LinearSearch extends FirstPage {
	void Linear() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Input number : ");
		n = scan.nextInt();
		System.out.println("Input list : ");
		for (int i = 0; i < n; i++) {
			x[i] = scan.nextInt();
		}
		System.out.println("Search number : ");
		b = scan.nextInt();
		for (int i = 0; i < x.length; i++) {
			if (x[i] == b) {
				c++;
				System.out.println("Search is successful and index number : "+(i+1));
				break;
			}	}
		if (c==0)

		{
			System.out.println("Search is unsuccessful");
		}
	}
}
