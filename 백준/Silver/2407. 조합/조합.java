import java.math.BigInteger;
import java.util.*;

public class Main {
    static int n, r;
    static BigInteger[][] memo;
    
    public static BigInteger DFS(int n, int r) {
        if (memo[n][r] != null) {
            return memo[n][r];
        }
        
        if (r == 0 || n == r) {
            return memo[n][r] = BigInteger.ONE;
        } else {
            BigInteger left = DFS(n - 1, r - 1);
            BigInteger right = DFS(n - 1, r);
            return memo[n][r] = left.add(right);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        memo = new BigInteger[101][101];
        
        n = sc.nextInt();
        r = sc.nextInt();
        
        System.out.println(DFS(n, r));
    }
}