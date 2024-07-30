import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int closestSum = 0;

        for (int i = 0; i < 10; i++) {
            int num = sc.nextInt();
            sum += num;

            if (Math.abs(100 - sum) < Math.abs(100 - closestSum)) {
                closestSum = sum;
            } else if (Math.abs(100 - sum) == Math.abs(100 - closestSum)) {
                // 100에 가까운 수가 두 개라면 더 큰 값을 선택
                if (sum > closestSum) {
                    closestSum = sum;
                }
            }
        }

        System.out.println(closestSum);
    }
}
