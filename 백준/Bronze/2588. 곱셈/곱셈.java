import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=  sc.nextInt();
        int b=  sc.nextInt();
        int one= a%10;
        int ten=(a/10)%10;
        int hun=a/100;
        int one2=b%10;
        int ten2=(b/10)%10;
        int hun2=(b/100);
        System.out.println(a*one2);
        System.out.println(a*ten2);
        System.out.println(a*hun2);
        System.out.println(a*b);
    }
}
