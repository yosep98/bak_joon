
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] maxArr = new int[n];
        int max = 0;
        int min = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int j = 0; j < n - 1; j++) { // IndexOutOfBoundException 방지
            if (arr[j] < arr[j + 1]) {
                if (min == 0) {
                    min = arr[j]; // min 변수 초기화
                }
                max = arr[j + 1]; // max 변수 초기화
            } else {
                maxArr[count] = max - min;
                count++;
                min = 0; // min 변수 초기화
                max = 0; // max 변수 초기화
            }
        }

        // 마지막 오르막길 처리
        if (min != 0) {
            maxArr[count] = max - min;
        }

        int maxVal = Arrays.stream(maxArr).filter(val -> val > 0).max().orElse(0); // 0보다 큰 값 중 최대값 찾기
        System.out.println(maxVal);
    }
}
