import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Deque<Integer> stack = new ArrayDeque<>();
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n=sc.nextInt();
		for(int i=0; i<n;i++){
			switch(sc.nextInt()){
				case 1:
					stack.addFirst(sc.nextInt());
					break;
				case 2:
					stack.addLast(sc.nextInt());
					break;
				case 3:
					if(!stack.isEmpty()){

						sb.append(stack.removeFirst()).append("\n");
					}
					else{
						sb.append(-1).append("\n");
					}
					break;
				case 4:
					if(!stack.isEmpty()){
						sb.append(stack.removeLast()).append("\n");
					}
					else{
						sb.append(-1).append("\n");
					}
					break;
				case 5:
					sb.append(stack.size()).append("\n");
					break;
				case 6:
					if(stack.isEmpty()){
						sb.append(1).append("\n");
					}
					else {
						sb.append(0).append("\n");
					}
					break;
				case 7:
					if(!stack.isEmpty()){
						sb.append(stack.peekFirst()).append("\n");
					}
					else{
						sb.append(-1).append("\n");
					}
					break;
				case 8:
					if(!stack.isEmpty()){
						sb.append(stack.peekLast()).append("\n");
					}
					else{
						sb.append(-1).append("\n");
					}
					break;




			}
		}
		System.out.println(sb.toString());

	}
}
