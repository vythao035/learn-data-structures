package GreedyAlgorithms;

import java.util.Scanner;

public class CIELRCPT{
    public static void main(String[] args) {
        int numTestCases;
        Scanner scanner = new Scanner(System.in);
        numTestCases = scanner.nextInt();

        while (numTestCases-- > 0 ) {
            int p = scanner.nextInt();
            int count = 0;
            for (int i=11; i >= 0; i--) {
                int price = (int) Math.pow(2, i);
                while ( p >= price) {
                    p = p - price;
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
