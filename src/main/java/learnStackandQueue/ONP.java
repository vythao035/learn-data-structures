package learnStackandQueue;

import jdk.internal.org.objectweb.asm.util.TraceAnnotationVisitor;

import java.util.Scanner;
import java.util.Stack;

public class ONP {
    public static boolean isLetterOrDigit(char c) {
        return (Character.isLetter(c) || Character.isDigit(c));
    }

    public static boolean isOperators(char c) {
        return (c == '+' || c == '-' || c == '*' || c == '/' || c == '^');
    }

    public static void main(String[] args) {
        int numTestCases;
        Scanner scanner = new Scanner(System.in);
        numTestCases = scanner.nextInt();
        while (numTestCases-- > 0) {
            Stack<Character> stack = new Stack<>();
            String s = scanner.next();
            String result = "";
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '(' || isOperators(s.charAt(i))) {
                    stack.add(s.charAt(i));
                }else if (isLetterOrDigit(s.charAt(i))) {
                    result += s.charAt(i);
                }else if (s.charAt(i) == ')'){
                   while (stack.peek() != '('){
                        result += stack.pop();
                   }
                   stack.pop();
                }
            }
            System.out.println(result);
        }
    }
}
