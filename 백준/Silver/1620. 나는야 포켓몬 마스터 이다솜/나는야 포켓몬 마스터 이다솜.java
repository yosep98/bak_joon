import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// M 은 포켓몬  개수
		int M = sc.nextInt();
		// N 은 맞춰야할 문제수
		int N = sc.nextInt();
		//포캣못 번호를 키로
		HashMap<Integer,String> map = new HashMap<>();
		// 포켓폰 이름을 키로
		HashMap<String,Integer> map2 = new HashMap<>();
		// 포켓몬 개수만큼 반복 저장
		for(int i=1;i<=M;i++){
			map.put(i,sc.next());
			map2.put(map.get(i),i);
		}
		// 문제 맞추기
		for(int i=1;i<=N;i++){
			String answer =sc.next();
			// 문자열일때
			if(answer.matches("[a-zA-Z]+")){
				System.out.println(map2.get(answer));
			}
			else{
				int num_answer = Integer.parseInt(answer);
				System.out.println(map.get(num_answer));
			}

		}

	}
}
