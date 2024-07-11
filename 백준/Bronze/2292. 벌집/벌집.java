import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 1;
        int now = 1;
        int N = sc.nextInt();
// 1-> 1+6->1+6+12 -> 1+6+12+18-> 1+6+12+18+24
//1번쨰(1)-> 2번째(2~7)->3번 째(8~19)
        while (N > count) {
            count += now * 6;
            now++;
        }
        System.out.println(now);
    }
}
