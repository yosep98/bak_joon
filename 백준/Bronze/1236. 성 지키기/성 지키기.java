
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        char[][] map = new char[R][C];
        for (int i = 0; i < R; i++) { 
            map[i] = sc.next().toCharArray();
        }
        
        int existRowCount = 0;
        for (int i = 0; i < R; i++) {
            boolean hasGuard = false;
            for (int j = 0; j < C; j++) {
                if (map[i][j] == 'X') {
                    hasGuard = true;
                    break; 
                }
            }
            if (hasGuard) {
                existRowCount++;
            }
        }

        int existColumCount = 0;
        for (int j = 0; j < C; j++) {
            boolean hasGuard = false;
            for (int i = 0; i < R; i++) {
                if (map[i][j] == 'X') {
                    hasGuard = true;
                    break; 
                }
            }
            if (hasGuard) {
                existColumCount++;
            }
        }

        int R_cnt = R - existRowCount;
        int C_cnt = C - existColumCount;

        System.out.println(Math.max(R_cnt, C_cnt));
    }
}