
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = 0;
        int M = sc.nextInt();
        int D = sc.nextInt();

        for (int i = 1; i < M; i++) {
            if (i == 4 || i == 6 || i == 9 || i == 11) {
                day += 30;
            } else if (i == 2) {
                day += 28;
            } else {
                day += 31;
            }
        }

        day += D; // 주어진 달의 일수를 더함

        day -= 1; // 1월 1일이 월요일이므로 1을 빼줌
        day %= 7; // 7로 나눠 나머지를 구함

        switch(day) {
            case 0: System.out.println("MON"); break;
            case 1: System.out.println("TUE"); break;
            case 2: System.out.println("WED"); break;
            case 3: System.out.println("THU"); break;
            case 4: System.out.println("FRI"); break;
            case 5: System.out.println("SAT"); break;
            case 6: System.out.println("SUN"); break;
        }
    }
}
