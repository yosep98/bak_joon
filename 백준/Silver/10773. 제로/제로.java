import java.util.Scanner;
import java.util.Stack;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> stack = new Stack<>();
		int answer= 0;
		int N = sc.nextInt();
		for(int i = 0;  i < N ;i++){
			int number = sc.nextInt();
			if(number ==0){
				stack.pop();
			}
			else{
				stack.push(number);
			}
		}
		for(int num : stack){
			answer+=num;
		}
		System.out.println(answer);

	}
}
