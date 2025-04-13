import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		// 배열 순서대로 저장
		for (int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}
		// 정렬
		int corret = 0;
		list.sort(Integer::compareTo);
		for (int i = 0; i < n; i++) {
			int num1 = list.get(i);
			int sum = 0;
			for (int j = i + 1; j < n; j++) {
				sum += list.get(j);
			}
			corret += num1 * sum;

		}
		System.out.println(corret);
	}

}
