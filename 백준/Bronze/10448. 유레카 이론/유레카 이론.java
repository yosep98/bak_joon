
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();  // 테스트 케이스 수 입력
        int[] triangularNumbers = new int[45];  // 삼각수를 저장하는 배열
        boolean ans;

        // 삼각수 미리 계산
        for (int i = 1; i < 45; i++) {
            triangularNumbers[i] = i * (i + 1) / 2;
        }

        for (int i = 0; i < N; i++) {
            int A = sc.nextInt();
            ans = false;

            // 세 개의 삼각수의 합이 A가 되는지 검사
            for (int a = 1; a < 45; a++) {
                for (int b = 1; b < 45; b++) {
                    for (int c = 1; c < 45; c++) {
                        if (triangularNumbers[a] + triangularNumbers[b] + triangularNumbers[c] == A) {
                            ans = true;
                            break;
                        }
                    }
                    if (ans) break;
                }
                if (ans) break;
            }

            // 결과 출력 (true면 1, false면 0)
            System.out.println(ans ? 1 : 0);
        }

        sc.close();
    }
}
