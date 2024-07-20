import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] A = new int[9];
        int sum = 0;

        // 9명의 난쟁이들의 키 입력 받기
        for (int i = 0; i < A.length; i++) {
            A[i] = sc.nextInt();
            sum += A[i];
        }

        Arrays.sort(A);
        int lie = sum - 100;

        // 두 명의 거짓 난쟁이 찾기
        for (int j = 0; j < 9; j++) {
            for (int k = j + 1; k < 9; k++) {
                if (A[j] + A[k] == lie) {
                    // 나머지 난쟁이들의 키 출력
                    for (int u = 0; u < 9; u++) {
                        if (u != j && u != k) {
                            System.out.println(A[u]);
                        }
                    }
                    return; // 프로그램 종료
                }
            }
        }
    }
}