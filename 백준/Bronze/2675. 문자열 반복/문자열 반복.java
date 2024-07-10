
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();  // 개행 문자를 제거하기 위해 추가

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            String text = sc.next(); // 문자열을 입력받음
            for (int j = 0; j < text.length(); j++) {
                for (int k = 0; k < a; k++) {
                    System.out.print(text.charAt(j));
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
