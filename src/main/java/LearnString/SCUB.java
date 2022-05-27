package LearnString;

import java.util.Scanner;

public class SCUB {
    public static void main(String[] args) {
        int numTestCases, lengthString;
        Scanner scanner = new Scanner(System.in);
        numTestCases = scanner.nextInt();
        while (numTestCases --> 0) {
            lengthString = scanner.nextInt();
            String string = scanner.next();
            long charOne = 0;
            for (int i=0; i<lengthString; i++) {
                if (string.charAt(i) == '1') {
                    charOne++;
                }
            }
            long result = charOne * (charOne + 1) /2;
            System.out.println(result);
        }
    }
}
