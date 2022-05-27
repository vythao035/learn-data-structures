package learnStackandQueue;

import java.util.Scanner;
import java.util.Stack;

public class JNEXT_Stack {
    public static void main(String[] args) {
        int numTestCase, numDigits;
        Scanner scanner = new Scanner(System.in);

        numTestCase = scanner.nextInt();

        while (numTestCase --> 0){
            numDigits = scanner.nextInt();
            Stack<Integer> stack = new Stack<>();

            for (int i=0; i<numDigits; i++){
                stack.add(scanner.nextInt());
            }
            int breakPoint = -1;

            Stack<Integer> stack1 = new Stack<>();
            for (int i=numDigits-2; i>=0; i--){
                stack1.add(stack.pop());
                int numCheck = stack.get(i);
                if (numCheck < stack1.peek()){
                    breakPoint = i;
                    break;
                }
            }
            int numBreakPoint = stack.get(breakPoint);
            Stack<Integer> stack2 = new Stack<>();
            Stack<Integer> stack3 = new Stack<>();
            for (int i=stack1.size()-1; i>=0; i--){
                if (numBreakPoint < stack1.get(i)){
                    stack2.add(stack1.pop());
                } else {
                    stack3.add(stack1.pop());
                }
            }
            //swap
            stack.set(stack.size()-1, stack2.pop());
            stack2.add(numBreakPoint);

            for (int i=stack3.size()-1; i>=0; i--){
                stack.add(stack3.pop());
            }
            for (int i=stack2.size()-1; i>=0; i--){
                stack.add(stack2.pop());
            }

            int resultNum = 0;
            for (int i=0; i<numDigits; i++){
                resultNum *=10;
                resultNum += stack.get(i);
            }
            System.out.println(resultNum);
        }
    }
}
