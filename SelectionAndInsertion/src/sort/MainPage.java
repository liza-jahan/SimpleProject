package sort;

import java.util.Scanner;

public class MainPage {


    public static void main(String[] args) {

        int t;
    Scanner scan = new Scanner(System.in);

    Selection s1=new Selection();
    InserTion s2=new InserTion();

	while(true) {
        System.out.println(">>>>>>>>>Sort calculator main menu<<<<<<<<");
        System.out.println("Choose any sort");
        System.out.println(" Press 1 for Selection sort");
        System.out.println(" Press 2 for Insertion sort");
        System.out.println(" press 0 for exit ");
        System.out.println(" Enter  choosing any  number : ");

        t=scan.nextInt();
        switch(t) {
            case 1:
                s1.Selection();
                break;
            case 2:
                  s2.InserTion();
                break;

            case 0:
                System.exit(0);
                break;
            default:
                System.out.println("Please select an option.");
        }
        System.out.println("\n");
    }
}
}

