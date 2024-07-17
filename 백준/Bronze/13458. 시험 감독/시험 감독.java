import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] room = new int[N];

        for(int i = 0; i < N; i++) {
            room[i] = sc.nextInt();
        }

        int B = sc.nextInt();
        int C = sc.nextInt();
        long count = 0;

        for(int j = 0; j < N; j++) {
            int remaining = room[j] - B; // 총감독관이 감시한 후 남은 응시자 수
            count++; // 총감독관 1명 추가

            if (remaining > 0) {
                count += (remaining / C); // 부감독관 수 추가

                if (remaining % C != 0) {
                    count++; // 나머지가 있는 경우 부감독관 1명 추가
                }
            }
        }

        System.out.println(count);
    }
}
