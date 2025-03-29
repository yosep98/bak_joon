import java.util.LinkedList;
import java.util.Scanner;
import java.util.Queue;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int front = 0;
		Queue<Integer> q = new LinkedList<>();
		int n = sc.nextInt();
		sc.nextLine();
		for(int i=0;i<n;i++){
			String order = sc.nextLine();
			String[] parts = order.split(" ");
			String command = parts[0];
			if(command.equals("push")){
				int num = Integer.parseInt(parts[1]);
				q.add(num);
				front = num;
			}
			else if(command.equals("pop")){
				if(q.isEmpty())
				{
					System.out.println(-1);
				}
				else {
					System.out.println(q.poll());
				}
			}
			else if(command.equals("empty")){
				if(q.isEmpty())
				{
					System.out.println(1);
				}
				else{
					System.out.println(0);
				}

			}
			else if(command.equals("size")){
				System.out.println(q.size());
			}
			else if(command.equals("front")){
				if(q.isEmpty()){
					System.out.println(-1);
				}
				else {
					System.out.println(q.peek());
				}
			}
			else if(command.equals("back")){
				if(q.isEmpty()){
					System.out.println(-1);
				}
				else{
					System.out.println(front);
				}
			}

		}


	}


}
