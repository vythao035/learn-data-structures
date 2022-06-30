package learnStackandQueue;

import java.util.*;

public class STPAR {
    public static void main(String[] args){
        int numMobiles;
        Scanner scanner = new Scanner(System.in);
        numMobiles = scanner.nextInt();
        Queue<Integer> queue = new LinkedList<>();
        Queue<Integer> queue1 = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();

        for (int i=0; i<numMobiles; i++){
            queue.add(scanner.nextInt());
        }

        for (int i=0; i<numMobiles-1; i++) {
            if (queue.peek() == 1) {
                queue1.add(queue.poll());
                if (queue.peek()==queue1.peek()+1){
                    queue1.add(queue.poll());
                }
                else{
                    stack.add(queue.poll());
                }
            }else {
                stack.add(queue.poll());
            }
        }
        Boolean isOrder = Boolean.TRUE;
        for (int i=0; i<stack.size()-1; i++){
            if (stack.get(i) > stack.get(i+1)) {
                isOrder = Boolean.TRUE;
            } else {
                isOrder = Boolean.FALSE;
            }
        }
        if (isOrder==Boolean.TRUE){
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
