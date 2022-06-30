package GreedyAlgorithms;

import java.util.Arrays;
import java.util.Scanner;

public class TACHSTCK {
    public static void main(String[] args) {
        int numSticks, lengthDifference;

        Scanner scanner = new Scanner(System.in);
        numSticks = scanner.nextInt();
        lengthDifference = scanner.nextInt();
        int[] sticks = new int[numSticks];
        for (int i=0; i<numSticks; i++) {
            sticks[i] = scanner.nextInt();
        }
        Arrays.sort(sticks);

        int numPairs = 0;
        for (int i=0; i<numSticks-1; i++) {
            if (isPair(sticks[i], sticks[i+1], lengthDifference)) {
                numPairs +=1;
                i++;
            }
        }
        System.out.println(numPairs);
    }

    private static boolean isPair(int stick1, int stick2, int lengthDifference) {
        if (Math.abs(stick1 - stick2) <= lengthDifference) return true;
        else return false;
    }
}
