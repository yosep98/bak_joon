
import java.util.HashSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		//곰곰티콘 이건 해쉬셋 문제임
		//엔터를 치면 해쉬셋 값 초기화 라고 생각하면 됨
		int sum=0;
		int num=0;
		int n = 0;
		HashSet<String> hashSet = new HashSet<>();
		String chat;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for(int i=0;i<n;i++){
			chat = sc.next();
			if(chat.equals("ENTER")){
				sum+=hashSet.size();
				hashSet.clear();
			}
			else{
				hashSet.add(chat);
			}

		}
		sum+=hashSet.size();
		System.out.println(sum);

	}
}
