import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.List;
import java.util.Set;

public class Main {
	public static void main(String[] args){
		Set set = new HashSet<>();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		// n번만큼 반복
		for(int i=0;i<n;i++){

			String name = sc.next();
			String input = sc.next();
			if(input.equals("enter")){
				set.add(name);
			}
			else if(input.equals("leave")){
				set.remove(name);
			}
		}
		List <String> list = new ArrayList<>(set);
		Collections.sort(list,Collections.reverseOrder());
		for(String s : list){
			System.out.println(s);
		}
	}
}
