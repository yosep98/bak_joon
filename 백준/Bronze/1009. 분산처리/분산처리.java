import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int num = a % 10;

            if (b == 0) {
                System.out.println(1);
                continue;
            }

            for (int j = 1; j < b; j++) {
                num = (num * a) % 10;
            }

            if (num == 0) {
                System.out.println(10);
            } else {
                System.out.println(num);
            }
        }
    }
}
