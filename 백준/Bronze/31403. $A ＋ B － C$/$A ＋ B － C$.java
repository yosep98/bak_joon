import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close(); // Scanner 닫기

		int sum = a + b - c;

		// 문자열 결합
		String AB = String.valueOf(a) + String.valueOf(b);

		// AB를 숫자로 변환 후 c를 빼기
		int sum2 = Integer.parseInt(AB) - c;

		System.out.println(sum);
		System.out.println(sum2);
	}
}
