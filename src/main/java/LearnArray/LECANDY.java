package LearnArray;

import java.util.Scanner;

public class LECANDY{
    public static void main (String[] args) throws Exception{
        int numTestCases = 0,  numElephants, numCandies;
        Scanner scanner = new Scanner(System.in);

        numTestCases = scanner.nextInt();

        while (numTestCases --> 0) {
            if (scanner.hasNextInt()) {
                numElephants = scanner.nextInt();
                numCandies = scanner.nextInt();

                int[] arr = new int[numElephants];
                for (int i = 0; i < numElephants; i++) {
                    arr[i] = scanner.nextInt();
                }
                int count = 0;
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] > numCandies) {
                        System.out.println("No");
                        break;
                    } else {
                        count++;
                        numCandies = numCandies - arr[i];
                        if (count == numElephants) {
                            System.out.println("Yes");
                        }
                    }
                }
            }
        }
    }
}
