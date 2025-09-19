import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();  // 물품 수
        int K = sc.nextInt();  // 배낭 용량
        
        int[] weight = new int[N + 1]; 
        int[] value = new int[N + 1];  
        
        // 물건 정보 입력
        for(int i = 1; i <= N; i++) {
            weight[i] = sc.nextInt();
            value[i] = sc.nextInt();
        }
        int[][] dp = new int[N + 1][K + 1];
        
        // DP 테이블 채우기
        for(int i = 1; i <= N; i++) {           
            for(int w = 1; w <= K; w++) {
                
                if(weight[i] <= w) {  
                    dp[i][w] = Math.max(
                        dp[i-1][w],                        // i번째 물건을 넣지 않는 경우
                        dp[i-1][w-weight[i]] + value[i]    // i번째 물건을 넣는 경우
                    );
                } else {
                    dp[i][w] = dp[i-1][w];
                }
            }
        }
        System.out.println(dp[N][K]);
    }
}