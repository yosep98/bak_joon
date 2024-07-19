import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] text = sc.nextLine().toUpperCase().toCharArray(); // 모두 대문자로 변환
        int[] Alpha = new int[26]; // 알파벳 빈도를 저장할 배열

        // 알파벳 빈도 계산
        for (char c : text) {
            if (c >= 'A' && c <= 'Z') {
                Alpha[c - 'A']++;
            }
        }

        int maxCount = 0;
        int maxIndex = -1;
        boolean isDuplicate = false;

        // 최대 빈도와 그 알파벳 찾기
        for (int i = 0; i < 26; i++) {
            if (Alpha[i] > maxCount) {
                maxCount = Alpha[i];
                maxIndex = i;
                isDuplicate = false;
            } else if (Alpha[i] == maxCount) {
                isDuplicate = true;
            }
        }

        // 결과 출력
        if (isDuplicate) {
            System.out.println("?");
        } else {
            System.out.println((char) (maxIndex + 'A'));
        }
    }
}
