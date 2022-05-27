package LearnArray;

import java.util.Scanner;

public class CNOTE {
    public static void main (String[] args) {
        int numTestCases, numPagesOfPoetry, numPagesCurrentBook, budget, numBooks, numPagesInBook, prices;
        Scanner scanner = new Scanner(System.in);
        numTestCases = scanner.nextInt();
        while (numTestCases --> 0) {
            if (scanner.hasNextInt()) {
                numPagesOfPoetry = scanner.nextInt();
                numPagesCurrentBook = scanner.nextInt();
                budget = scanner.nextInt();
                numBooks = scanner.nextInt();

                int lucky = 0;
                for (int i=0; i<numBooks; i++) {
                    numPagesInBook = scanner.nextInt();
                    prices = scanner.nextInt();
                    if (budget >= prices && numPagesInBook >= (numPagesOfPoetry - numPagesCurrentBook)) {
                        lucky++;
                    }
                }
                if (lucky > 0) {
                    System.out.println("LuckyChef");
                } else {
                    System.out.println("UnluckyChef");
                }
            }
        }
    }
}
