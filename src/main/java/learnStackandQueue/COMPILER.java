package learnStackandQueue;

import java.util.Scanner;
import java.util.Stack;

public class COMPILER {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int numTestCases;
        numTestCases = scanner.nextInt();
        scanner.nextLine();
        for (int i=0; i<numTestCases; i++) {
            Stack<Character> stack = new Stack<>();
            String c = scanner.nextLine();
            char[] charaters = c.toCharArray();
            int count =0;
            for (int ii=0; ii<c.length(); ii++) {
                if (charaters[ii] == '<') {
                    stack.add(charaters[ii]);
                } else {
                    if (stack.isEmpty()) {
                        continue;
                    }else {
                        stack.pop();
                        count++;
                    }
                }
            }
            System.out.println(count*2);
        }
    }
}
