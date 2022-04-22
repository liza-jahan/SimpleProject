package sort;

import java.util.Scanner;


public class InserTion {
    int[] x = new int[100];
    int n, i, min, b, num;


    void InserTion() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input number : ");
        n = scan.nextInt();
        System.out.println("Input list : ");

        for (i = 0; i < n; i++) {
            x[i] = scan.nextInt();
        }
        System.out.println("\n");
        System.out.println(">>>>>>>>>Insertion sort main menu<<<<<<<<");
        System.out.println("Choose ascending order or descending order");
        System.out.println(" Press 1 for Ascending order");
        System.out.println(" Press 2 for Descending order");
        System.out.println(" press 0 for exit ");
        System.out.println(" Enter your choosing number : ");
        for (int k = 1; k < n - 1; k++) {
            int temp = x[k];
            int j = k - 1;
            while (j >= 0 && temp <= x[j]) {
                x[j + 1] = x[j];
                j = j - 1;
            }
            x[j + 1] = temp;
        }
        num = scan.nextInt();
        switch (num) {
            case 1:
                System.out.println("Ascending order : ");

                for (i = 0; i < n; i++) {
                    System.out.print(" " + x[i]);
                }
                break;

            case 2:
                System.out.println("Descending order : ");
                for (i = n - 1; i >= 0; i--) {
                    System.out.print(" " + x[i]);
                }
                break;
        }
        System.out.println("\n");
        System.out.println("press 0 and  exit selection sort: ");
        num = scan.nextInt();
        if (num == 0) {
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
