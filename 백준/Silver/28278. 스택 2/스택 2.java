import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();

		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int m = sc.nextInt();
			switch (m) {
				case 1:
					stack.push(sc.nextInt());
					break;
				case 2:
					if (!stack.isEmpty()) {
						sb.append(stack.pop()).append("\n");
					} else {
						sb.append(-1).append("\n");
					}
					break;
				case 3:
					sb.append(stack.size()).append("\n");
					break;
				case 4:
					sb.append(stack.isEmpty() ? 1 : 0).append("\n");
					break;
				case 5:
					if (!stack.isEmpty()) {
						sb.append(stack.peek()).append("\n");
					} else {
						sb.append(-1).append("\n");
					}
					break;
			}
		}

		// 한 번에 출력
		System.out.print(sb.toString());
	}
}
