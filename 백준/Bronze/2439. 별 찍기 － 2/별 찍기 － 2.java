import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			//n-1개 공백
			for (int j = 0; j < n - i - 1; j++) {
				System.out.print(" ");
			}
			//i개 별출력
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println(); 
		}

	}
}
