
import java.util.Scanner;
import java.util.Stack;
public class Main {
	public static void main(String[]args) {
		// 괄호 문자열이 재대로 닫혀있는지 확인하는 문제
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			boolean isValid=true;
			// 스택 초기화
			Stack<Character> stack = new Stack<>();
			// 문자열 입력
			String s = sc.next();
			// 문자열 길이만큼 반복
			for (int j = 0; j < s.length(); j++) {
				// ( 면 푸시
				if (s.charAt(j) == '(') {
					stack.push(s.charAt(j));
				}
				// )면 팝(비어있을경우 NO 출력 후 반복문 돌아가기)
				else if (s.charAt(j) == ')') {
					if (stack.isEmpty()) {
						System.out.println("NO");
						isValid = false;
						break;
					} else {
						stack.pop();
					}
				}
			}
			// 반복문 다 돌았을 떄 비어있으면 잘 맞아 떨어진거임
			if (isValid) {
				if (stack.isEmpty()) {
					System.out.println("YES");
				}
				else{
					System.out.println("NO");
				}

			}
		}
	}
			}






