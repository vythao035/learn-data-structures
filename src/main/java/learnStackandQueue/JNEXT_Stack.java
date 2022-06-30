package learnStackandQueue;

import java.util.Scanner;
import java.util.Stack;

public class JNEXT_Stack {
    private static Stack<Integer> readInputNumbers(Scanner scanner) {
        int numDigits = scanner.nextInt();
        Stack<Integer> stack = new Stack<>();
        for (int i=0; i<numDigits; i++) {
            stack.add(scanner.nextInt());
        }
        return stack;
    }

    private static int getBreakNumIndex(Stack<Integer> stack, Stack<Integer> stack1) {
        int breakIndexNumber = -1;
        for (int i=stack.size() -2; i>=0; i--){
            int numCheck = stack.get(i);
            stack1.add(stack.pop());
            if (numCheck < stack1.peek()) {
                breakIndexNumber = i;
                break;
            }
        }
        return breakIndexNumber;
    }

    private static int getNextGreaterNum(Stack<Integer> stack1, int breakNum, Stack<Integer> stack2, Stack<Integer> stack3){
        for (int i=stack1.size()-1; i>=0; i--){
            if (breakNum < stack1.get(i)) {
                stack2.add(stack1.pop());
            } else {
                stack3.add(stack1.pop());
            }
        }
        int nextGreaterNum = stack2.peek();
        return nextGreaterNum;
    }

    private static Stack<Integer> mergeStack(Stack<Integer> stack, Stack<Integer> stack2, Stack<Integer> stack3,
                                             int numBreakPoint, int nextGreaterNum){
        stack.set(stack.size() - 1, nextGreaterNum);
        stack2.pop();
        stack2.add(numBreakPoint);

        for (int i = stack3.size() - 1; i >= 0; i--) {
            stack.add(stack3.pop());
        }
        for (int i = stack2.size() - 1; i >= 0; i--) {
            stack.add(stack2.pop());
        }
        return stack;
    }

    private static int getIntFromStack(Stack<Integer> stack) {
        int resultNum = 0;
        for (int i = 0; i < stack.size(); i++) {
            resultNum *= 10;
            resultNum += stack.get(i);
        }
        return resultNum;
    }

    public static void main(String[] args) {
        int numTestCase, numDigits;
        Scanner scanner = new Scanner(System.in);
        numTestCase = scanner.nextInt();

        while (numTestCase-- > 0) {
            Stack<Integer> stack = readInputNumbers(scanner);
            Stack<Integer> stack1 = new Stack<>();
            int breakPoint = getBreakNumIndex(stack, stack1);

            if (breakPoint == -1) {
                System.out.println("-1");
            } else {
                int numBreakPoint = stack.get(breakPoint);
                Stack<Integer> stack2 = new Stack<>();
                Stack<Integer> stack3 = new Stack<>();
                int nextGreaterNum = getNextGreaterNum(stack1, numBreakPoint, stack2, stack3);

                stack = mergeStack(stack, stack2, stack3, numBreakPoint, nextGreaterNum);

                int resultNum = getIntFromStack(stack);
                System.out.println(resultNum);
            }
        }
    }
}
