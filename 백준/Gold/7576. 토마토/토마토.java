import java.util.*;

public class Main {
    static int[][] arr;
    static int[][] dist;
    static int n, m; // n: 가로(열), m: 세로(행)
    static int[] dx = {0, 0, -1, 1}; // 상하좌우
    static int[] dy = {1, -1, 0, 0};

    public static int BFS() {
        Queue<int[]> q = new LinkedList<>();

     
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(arr[i][j] == 1) {
                    q.offer(new int[]{i, j}); 
                    dist[i][j] = 0; 
                }
            }
        }

        // 2단계: BFS 실행
        while(!q.isEmpty()) {
            int[] current = q.poll();
            int x = current[0];
            int y = current[1];

            // 4방향 탐색
            for(int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                
                if(nx >= 0 && nx < m && ny >= 0 && ny < n && arr[nx][ny] == 0) {
                    arr[nx][ny] = 1; 
                    dist[nx][ny] = dist[x][y] + 1; 
                    q.offer(new int[]{nx, ny}); 
                }
            }
        }

        
        int maxDay = 0;

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(arr[i][j] == 0) {
                    return -1; // 익지 않은 토마토가 있음
                }
                // 빈 상자(-1)가 아닌 경우에만 최대값 갱신
                if(arr[i][j] == 1) {
                    maxDay = Math.max(maxDay, dist[i][j]);
                }
            }
        }

        return maxDay;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt(); 
        m = sc.nextInt(); 

        arr = new int[m][n];
        dist = new int[m][n];
        
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int result = BFS();
        System.out.println(result);

        sc.close();
    }
}