
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt(); // 시간 입력
        int m = sc.nextInt(); // 분 입력
        int s = sc.nextInt(); // 초 입력
        int ms = sc.nextInt(); // 추가 초 입력

        // 현재 시간을 초로 변환
        int currentTimeInSeconds = h * 3600 + m * 60 + s;
        // 추가할 초를 더함
        int totalTimeInSeconds = currentTimeInSeconds + ms;

        // 새 시간 계산
        int newH = (totalTimeInSeconds / 3600) % 24; // 24시간 단위로 나머지 계산
        int newM = (totalTimeInSeconds % 3600) / 60; // 분 계산
        int newS = totalTimeInSeconds % 3600 % 60; // 초 계산

        System.out.println(newH + " " + newM + " " + newS); // 결과 출력
    }
}
