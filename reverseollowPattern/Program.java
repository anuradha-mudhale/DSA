package reverseHollowPattern;


import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                // पहिली row किंवा शेवटचा column print करा
                if (i == n || j == 1 || j == i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  "); // space inside
                }
            }
            System.out.println();
        }

        sc.close();
    }
}

