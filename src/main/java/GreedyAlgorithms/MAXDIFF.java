package GreedyAlgorithms;

import java.util.Arrays;
import java.util.Scanner;

public class MAXDIFF {
    public static void main(String[] args) {
        int numTestCases, numItems, k;
        Scanner scanner = new Scanner(System.in);
        numTestCases = scanner.nextInt();
        while (numTestCases-- > 0) {
            numItems = scanner.nextInt();
            k = scanner.nextInt();
            int[] items = new int[numItems];

            for (int i=0; i<numItems; i++) {
                items[i] = scanner.nextInt();
            }
            System.out.println(maxDiffWeight(items, k, numItems));
        }
    }
    private static int maxDiffWeight(int[] items, int k, int numItems) {
        Arrays.sort(items);
        int weightSon = 0;
        int weightChef = 0;

        for (int i=0; i<k; i++){
            weightSon += items[i];
        }
        for (int i=k; i<numItems; i++){
            weightChef += items[i];
        }

        return Math.abs(weightChef - weightSon);
    }
}
