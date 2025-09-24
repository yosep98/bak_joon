import java.util.*;

public class Main {
    static int N, M;
    static int[] targets;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        N = sc.nextInt(); 
        M = sc.nextInt(); 
        
        targets = new int[M];
        for (int i = 0; i < M; i++) {
            targets[i] = sc.nextInt();
        }
        
        LinkedList<Integer> deque = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            deque.offer(i);
        }
        
        int totalOperations = 0;
        
        for (int target : targets) {
            int index = deque.indexOf(target);
            
            int leftRotations = index;
            int rightRotations = deque.size() - index;
            
            if (leftRotations <= rightRotations) {
                for (int i = 0; i < leftRotations; i++) {
                    deque.offerLast(deque.pollFirst());
                }
                totalOperations += leftRotations;
            } else {
                for (int i = 0; i < rightRotations; i++) {
                    deque.offerFirst(deque.pollLast());
                }
                totalOperations += rightRotations;
            }
            
            deque.pollFirst();
        }
        
        System.out.println(totalOperations);
    }
}