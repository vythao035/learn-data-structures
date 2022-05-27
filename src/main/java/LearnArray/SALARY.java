package LearnArray;

import java.util.Arrays;
import java.util.Scanner;

public class SALARY {
    public static void main(String[] args) {
        int numTestCases, numWorkers;
        int[] salariesOfWorkers;
        Scanner scanner = new Scanner(System.in);
        numTestCases = scanner.nextInt();
        while (numTestCases --> 0) {
            numWorkers = scanner.nextInt();
            salariesOfWorkers = new int[numWorkers];
            for (int i =0; i<numWorkers; i++){
                salariesOfWorkers[i] = scanner.nextInt();
            }
            Arrays.sort(salariesOfWorkers);
            int minSalary = salariesOfWorkers[0];
            int turns = 0;
            for (int i=0; i<numWorkers; i++){
                turns += salariesOfWorkers[i] - minSalary;
            }
            System.out.println(turns);
        }
    }
}
