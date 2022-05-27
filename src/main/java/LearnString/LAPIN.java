package LearnString;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class LAPIN {
    public static void main(String[] args) {
        int numTestCases;
        Scanner scanner = new Scanner(System.in);
        numTestCases = scanner.nextInt();
        while (numTestCases --> 0) {
            String s = scanner.next();
            int stringLength = s.length();
            String subString1, subString2;
            if (stringLength % 2 == 0 ) {
                subString1 = s.substring(0, stringLength/2);
                subString2 = s.substring(stringLength/2, stringLength);
            } else {
                subString1 = s.substring(0, stringLength/2);
                subString2 = s.substring(stringLength/2 + 1, stringLength);
            }

            char[] subString1Array = subString1.toCharArray();
            Arrays.sort(subString1Array);
            char[] subString2Array = subString2.toCharArray();
            Arrays.sort(subString2Array);

            if (Arrays.equals(subString1Array, subString2Array)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
