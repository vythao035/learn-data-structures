package learnStackandQueue;

import org.yaml.snakeyaml.util.ArrayUtils;

import java.util.*;

public class JNEXT {
    public static void main(String[] args) {
        int numTestCases;
        Scanner scanner = new Scanner(System.in);
        numTestCases = scanner.nextInt();

        while (numTestCases --> 0) {
            int numDigits = scanner.nextInt();
            int[] arr = new int[numDigits];

            for (int i=0; i<numDigits; i++){
                int number = scanner.nextInt();
                arr[i] = number;
            }
            int breakPoint = -1;
            for (int i=numDigits - 2; i >= 0; i--){
                int checkNum = arr[i];
                if (checkNum < arr[i+1]) {
                    breakPoint = i;
                    break;
                }
            }
            if (breakPoint == -1) {
                System.out.println("-1");
            } else {
                System.out.println("Breakpoint: " + breakPoint);
                int[] threshNums = Arrays.copyOfRange(arr,breakPoint+1, numDigits);
                Arrays.sort(threshNums);
                System.out.println("Thresh Number Array: "+ Arrays.toString(threshNums));
                int threshNum = 0;
                int threshNumIndex = 0;
                for (int i=0; i<threshNums.length; i++) {
                    if (arr[breakPoint] <threshNums[i]) {
                        threshNum = threshNums[i];
                        threshNumIndex = i;
                        break;
                    }
                }
                System.out.println("Thresh Number: " + threshNum + " at " + threshNumIndex);
                int numBreakPoint = arr[breakPoint];
                arr[breakPoint] = threshNum;
                int[] arr1 = Arrays.copyOfRange(arr, 0, breakPoint+1);
                threshNums[threshNumIndex] = numBreakPoint;
                Arrays.sort(threshNums);

                int[] result = new int[numDigits];
                for (int i=0; i<arr1.length; i++){
                    result[i] = arr1[i];
                }
                for (int i = arr1.length; i<numDigits; i++){
                    result[i] = threshNums[i-arr1.length];
                }
                int numResult = 0;
                for (int i=0; i<numDigits; i++){
                    numResult *=10;
                    numResult += result[i];

                }
                System.out.println(numResult);
            }
        }
    }
}
