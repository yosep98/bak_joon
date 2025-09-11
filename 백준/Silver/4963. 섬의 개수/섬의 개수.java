import java.util.*;
public class Main {
    static int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};  
    static int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};
    static int[][] arr;
    static boolean[][] ch;
    static int answer;
    static int w,h;
    public static void DFS(int x, int y) {
        ch[x][y] = true;

        for(int i = 0; i < 8; i++) {  
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx >= 0 && nx < h && ny >= 0 && ny < w
                    && arr[nx][ny] == 1 && !ch[nx][ny]) {
                DFS(nx, ny);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            w = sc.nextInt();  // 너비 (열)
            h = sc.nextInt();  // 높이 (행)

            if(w == 0 && h == 0) break;  // 종료 조건

            arr = new int[h][w];   // h x w 배열
            ch = new boolean[h][w];
            answer = 0;            // 매번 초기화!

            for(int i = 0; i < h; i++) {
                for(int j = 0; j < w; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }

            for(int i = 0; i < h; i++) {
                for(int j = 0; j < w; j++) {
                    if(arr[i][j] == 1 && !ch[i][j]) {
                        DFS(i, j);
                        answer++;
                    }
                }
            }

            System.out.println(answer);
        }
    }

}
