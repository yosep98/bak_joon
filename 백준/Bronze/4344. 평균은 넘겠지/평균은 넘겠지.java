
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int C = sc.nextInt(); // 테스트 케이스의 수

        for(int i = 0; i < C; i++) {
            int N = sc.nextInt(); // 학생 수
            int[] scores = new int[N];
            int sum = 0;

            for(int j = 0; j < N; j++) {
                scores[j] = sc.nextInt();
                sum += scores[j];
            }

            double avg = (double) sum / N;
            int count = 0;

            for(int j = 0; j < N; j++) {
                if(scores[j] > avg) {
                    count++;
                }
            }

            double percentage = (double) count / N * 100;
            System.out.printf("%.3f%%\n", percentage);
        }

        sc.close();
    }
}
