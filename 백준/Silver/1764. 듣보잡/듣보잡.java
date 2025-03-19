
import java.util.*;
public class Main {
	public static void main(String[] args){
		List<String> list = new ArrayList<>();
		ArrayList<String> list1 = new ArrayList<>();
		Scanner sc= new Scanner(System.in);
		//듣지못한 사람의 수
		int N=sc.nextInt();
		//보도봇한 사람의 수
		int M=sc.nextInt();
		//
		HashMap<String,Integer> map=new HashMap<>();
		String[] arr = new String[N];

		for(int i=0;i<N;i++){
			arr[i]=sc.next();
		}
		// 보도 못한사람을 해시맵으로
		for(int i=0;i<M;i++){
			map.put(sc.next(),1);
		}
		for(int i=0;i<N;i++){
			if(map.containsKey(arr[i])) {
				list1.add(arr[i]);
			}
		}
		System.out.println(list1.size());
		list1.sort(String::compareTo);
		for(String i : list1){
			System.out.println(i);
		}
		// 보도 못한 사람을 해시맵에 추가

		//듣도못한사람과 equlas 이면 stack에 넣거나 ++ 해서 인트값 list추가해서 list 크기 알수있고 뱉음


	}
}

