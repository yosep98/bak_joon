import java.util.Scanner;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
public class Main {
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		HashMap<String,String> map= new HashMap<>();

		int n = sc.nextInt();
		int m =sc.nextInt();
		for(int i =0; i<n;i++){
			String key = sc.next();
			String value = sc.next();
			// N 번동안 키 벨류 저장
			map.put(key,value);
		}
		// 키값을 입력하면 벨류값이 나오게

		for(int i=0;i<m;i++){
			String key = sc.next();
			System.out.println(map.get(key));
		}

	}
}
