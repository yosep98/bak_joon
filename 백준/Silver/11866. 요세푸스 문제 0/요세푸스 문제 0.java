import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
public class Main {
	public static void main(String[]args){
		Scanner sc= new Scanner(System.in);
		Queue<Integer> q=new LinkedList<>();
		List<Integer> list=new ArrayList<>();
		int n = sc.nextInt();
		int M = sc.nextInt();
		for(int i=0;i<n;i++){
			q.add(1+i);
		}
		// 사람들이 다 사라질 때까지
		while(!q.isEmpty()) {
			for (int i = 0; i < M - 1; i++) {
				q.add(q.poll());
			}
			list.add(q.poll());
		}
		System.out.print("<");
		for (int i = 0; i < list.size(); i++) {
			if (i == list.size() - 1) {
				System.out.print(list.get(i));
			} else {
				System.out.print(list.get(i) + ", ");
			}
		}
		System.out.println(">");
		}

	}


