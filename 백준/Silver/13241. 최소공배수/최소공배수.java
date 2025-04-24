import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextInt();
		long m = sc.nextInt();
		long ans=0;

		//두 수 의 약수를 구하고 최소값을 구하면 그게 최소 공배수 인가 그건
		long a = n;
		long b=m;
		while (b!=0){
			long temp=b;
			b=a%b;
			a=temp;
		}
		//여기서 최대 공약수 c 가 나옴
		System.out.println(n*m/a);
		}

}
