import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int original = A;
        int count = 0;
        int a=0;
        int b=0;
        while (true) {
            if(A<=10)
            {
                a=0;
                b=A;
            }
            a = A / 10;
            b = A % 10;
            int sum = a + b;
            A = (b * 10) + (sum % 10);
            count++;
            if (A == original&&count!=0) {
                break;
            }
        }
        System.out.println(count);
    }
}
