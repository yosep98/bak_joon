import java.util.*;

public class Main {
    static int[][][] arr;
    static int[][][] dist;
    static int m, n, h; 

    // 6방향: 상하좌우 + 위아래
    static int[] dx = {0, 0, -1, 1, 0, 0};
    static int[] dy = {1, -1, 0, 0, 0, 0};
    static int[] dz = {0, 0, 0, 0, -1, 1};

    public static int BFS() {
        Queue<int[]> q = new LinkedList<>();

        
        for(int k = 0; k < h; k++) {
            for(int i = 0; i < n; i++) {
                for(int j = 0; j < m; j++) {
                    if(arr[k][i][j] == 1) {
                        q.offer(new int[]{k, i, j}); // z, x, y 
                        dist[k][i][j] = 0; 
                    }
                }
            }
        }

        // 2단계: BFS 실행
        while(!q.isEmpty()) {
            int[] current = q.poll();
            int z = current[0]; // 높이
            int x = current[1]; // 세로
            int y = current[2]; // 가로

            // 6방향 탐색
            for(int i = 0; i < 6; i++) {
                int nz = z + dz[i];
                int nx = x + dx[i];
                int ny = y + dy[i];

                
                if(nz >= 0 && nz < h && nx >= 0 && nx < n && ny >= 0 && ny < m
                        && arr[nz][nx][ny] == 0) {

                    arr[nz][nx][ny] = 1; 
                    dist[nz][nx][ny] = dist[z][x][y] + 1; 
                    q.offer(new int[]{nz, nx, ny}); 
                }
            }
        }

        // 3단계: 결과 계산
        int maxDay = 0;

        for(int k = 0; k < h; k++) {
            for(int i = 0; i < n; i++) {
                for(int j = 0; j < m; j++) {
                    if(arr[k][i][j] == 0) {
                        return -1; 
                    }
             
                    if(arr[k][i][j] == 1) {
                        maxDay = Math.max(maxDay, dist[k][i][j]);
                    }
                }
            }
        }

        return maxDay;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        m = sc.nextInt(); // 가로 
        n = sc.nextInt(); // 세로 
        h = sc.nextInt(); // 높이 

        arr = new int[h][n][m];
        dist = new int[h][n][m];

  
        for(int k = 0; k < h; k++) {
            for(int i = 0; i < n; i++) {
                for(int j = 0; j < m; j++) {
                    arr[k][i][j] = sc.nextInt();
                }
            }
        }

        int result = BFS();
        System.out.println(result);

        sc.close();
    }
}