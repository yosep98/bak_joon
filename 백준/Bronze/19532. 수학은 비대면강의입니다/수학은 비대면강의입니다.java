
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int f = sc.nextInt();

        // 크래머의 법칙을 이용해 x와 y를 계산
        int denominator = a * e - b * d;
        int x = (c * e - b * f) / denominator;
        int y = (a * f - c * d) / denominator;

        // 결과 출력
        System.out.println(x + " " + y);
    }
}
