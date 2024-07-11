import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        String phone = sc.nextLine();
        for (int i = 0; i < phone.length(); i++) {
            char ch = phone.charAt(i);
            if (ch == 'A' || ch == 'B' || ch == 'C') {
                count += 3;
            } else if (ch == 'D' || ch == 'E' || ch == 'F') {
                count += 4;
            } else if (ch == 'G' || ch == 'H' || ch == 'I') {
                count += 5;
            } else if (ch == 'J' || ch == 'K' || ch == 'L') {
                count += 6;
            } else if (ch == 'M' || ch == 'N' || ch == 'O') {
                count += 7;
            } else if (ch == 'P' || ch == 'Q' || ch == 'R' || ch == 'S') {
                count += 8;
            } else if (ch == 'T' || ch == 'U' || ch == 'V') {
                count += 9;
            } else if (ch == 'W' || ch == 'X' || ch == 'Y' || ch == 'Z') {
                count += 10;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
