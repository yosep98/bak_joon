import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int n =str.length();
		String[] arr = new String[n];
		for(int i=0;i<n;i++){
			arr[i]=str.substring(i,n);
		}
		Arrays.sort(arr);
		for(String s:arr){
			System.out.println(s);
	}


	}

}
