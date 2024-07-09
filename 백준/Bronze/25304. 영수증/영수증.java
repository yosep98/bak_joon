import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();// X= 총가격
        int n = sc.nextInt();// n= 물건 종류 수
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt(); // 물건의 가격
            int b = sc.nextInt();  // 물건의 개수
            sum+= a*b;
        }
        if(sum==x)
            System.out.println("Yes");
        else
            System.out.println("No");


    }
}
