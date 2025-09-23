import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int k = sc.nextInt();
        
        Integer[] scores = new Integer[N];
        for (int i = 0; i < N; i++) {
            scores[i] = sc.nextInt();
        }
        
        Arrays.sort(scores, Collections.reverseOrder());

        int cutline = scores[k-1];
        
        System.out.println(cutline);
        
        sc.close();
    }
}