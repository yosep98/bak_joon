import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next(); // 한 줄로 입력 받기
        int B = sc.nextInt(); // 진수 입력 받기
        int sum = 0;

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            int value;

            if (c >= '0' && c <= '9') {
                value = c - '0'; // 숫자 0-9
            } else {
                value = c - 'A' + 10; // 문자 A-Z
            }

            sum += value * Math.pow(B, text.length() - 1 - i); // 역순으로 계산
        }

        System.out.println(sum);
    }
}
