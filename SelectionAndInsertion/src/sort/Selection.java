package sort;

import java.util.Scanner;

public class Selection {
    int[] x = new int[100];
    int n, i, min, b, num;

    void Selection() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input number : ");
        n = scan.nextInt();
        System.out.println("Input list : ");

        for (i = 0; i < n; i++) {
            x[i] = scan.nextInt();
        }
        System.out.println("\n");
        System.out.println(">>>>>>>>>Selection sort main menu<<<<<<<<");
        System.out.println("Choose ascending order or descending order");
        System.out.println(" Press 1 for Ascending order");
        System.out.println(" Press 2 for Descending order");
        System.out.println(" press 0 for exit ");
        System.out.println(" Enter your choosing number : ");

        for (i = 0; i < n - 1; i++) {
            min = i;
            for (int j = i + 1; j < n; j++) {
                if (x[j] < x[min]) {
                    min = j;
                }
            }
            b = x[i];
            x[i] = x[min];
            x[min] = b;

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