import java.util.*;

class Point{
    public int x, y;
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }
}

public class Main {
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int[][] arr;
    static int[][] dist;
    static int n, m;

    public static void BFS(int x, int y){
        Queue<Point> q = new LinkedList<>();
        q.offer(new Point(x, y));
        dist[x][y] = 1;

        while(!q.isEmpty()) {
            Point tmp = q.poll();

            for(int i = 0; i < 4; i++){
                int nx = tmp.x + dx[i];
                int ny = tmp.y + dy[i];

                if(nx >= 1 && nx <= n && ny >= 1 && ny <= m
                        && arr[nx][ny] == 1 && dist[nx][ny] == 0){

                    dist[nx][ny] = dist[tmp.x][tmp.y] + 1;
                    q.offer(new Point(nx, ny));
                }
            }
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        arr = new int[n+1][m+1];
        dist = new int[n+1][m+1];

        for(int i = 1; i <= n; i++){
            String line = sc.next();
            for(int j = 1; j <= m; j++){
                arr[i][j] = line.charAt(j-1) - '0';
            }
        }

        
        if(arr[1][1] == 0) {
            System.out.println(-1);
            return;
        }

        BFS(1, 1);

        
        if(dist[n][m] == 0) {
            System.out.println(-1);
        } else {
            System.out.println(dist[n][m]);
        }
    }
}