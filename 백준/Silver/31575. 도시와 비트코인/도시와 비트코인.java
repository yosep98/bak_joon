import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();  
        int M = sc.nextInt();  

        int[][] city = new int[M][N];  
        boolean[][] dp = new boolean[M][N];  

      
        for(int i = 0; i < M; i++) {
            for(int j = 0; j < N; j++) {
                city[i][j] = sc.nextInt();
            }
        }

      
        dp[0][0] = (city[0][0] == 1);

        // 첫 번째 행 
        for(int j = 1; j < N; j++) {
            if(city[0][j] == 1 && dp[0][j-1]) {
                dp[0][j] = true;
            }
        }

        // 첫 번째 열 
        for(int i = 1; i < M; i++) {
            if(city[i][0] == 1 && dp[i-1][0]) {
                dp[i][0] = true;
            }
        }

        // DP 
        for(int i = 1; i < M; i++) {
            for(int j = 1; j < N; j++) {
                if(city[i][j] == 1) {  // 갈 수 있는 칸이면
                    // 위쪽에서 오거나 왼쪽에서 올 수 있으면 도달 가능
                    dp[i][j] = dp[i-1][j] || dp[i][j-1];
                }
            }
        }

       
        if(dp[M-1][N-1]) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}