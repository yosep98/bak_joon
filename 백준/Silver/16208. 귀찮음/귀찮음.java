import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long sum=0;
		long corret = 0;
		ArrayList<Integer> list = new ArrayList<>();
		// 배열 순서대로 저장
		for (int i = 0; i < n; i++) {
			int num = sc.nextInt();
			list.add(num);
			sum+=num;
		}
		// 정렬
		list.sort(Integer::compareTo);
		for (int i = 0; i < n; i++) {
			int num1 = list.get(i);
			sum-=num1;
			corret+=num1*(sum);
			}
		System.out.println(corret);
		}
	}


