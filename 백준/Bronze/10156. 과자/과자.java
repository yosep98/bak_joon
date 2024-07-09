
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 과자 가격 K 과자 개수 n  현재 가진 돈의 액수 m
        int NeedMoney=0;
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int m = sc.nextInt();
        NeedMoney=k*n;
        if((NeedMoney-m)<0)
            System.out.println("0");
        else
        System.out.println(NeedMoney-m);
    }
}
