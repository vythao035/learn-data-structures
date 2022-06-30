package Recursion;

import java.util.Scanner;

public class NOKIA {
    private static int maxWire(int n){
        return ((n +1) * (n + 2) / 2 - 1);
    }

    private static int minWire(int n) {
        if (n==0) return 0;
        else if (n==1) return 2;
        else {
            return (n + 1 + minWire((n-1)/ 2) + minWire((n - 1) - (n - 1)/ 2));
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numTestCases;
        numTestCases = scanner.nextInt();
        while (numTestCases-- > 0) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();

            if (m > maxWire(n)){
                System.out.println(m-maxWire(n));
            } else if (m < minWire(n)){
                System.out.println(-1);
            } else {
                System.out.println(0);
            }

        }
    }
}
