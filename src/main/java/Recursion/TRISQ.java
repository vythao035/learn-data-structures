package Recursion;

import java.util.Scanner;

public class TRISQ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numTestCases = scanner.nextInt();
        while (numTestCases-- > 0) {
            int base = scanner.nextInt();
            System.out.println(numSquares(base));
        }
    }
    private static int numSquares (int base) {
        if (base <= 3) {
            return 0;
        } else {
            return base / 2 - 1 + numSquares(base - 2);
        }
    }
}
