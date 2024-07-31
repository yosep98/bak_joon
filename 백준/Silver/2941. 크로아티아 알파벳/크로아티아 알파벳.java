import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        int length = text.length();

        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i);

            if (currentChar == 'c') {
                if (i < length - 1) {
                    char nextChar = text.charAt(i + 1);
                    if (nextChar == '=' || nextChar == '-') {
                        i++; // 다음 문자 건너뛰기
                    }
                }
            } else if (currentChar == 'd') {
                if (i < length - 1) {
                    char nextChar = text.charAt(i + 1);
                    if (nextChar == '-') {
                        i++;
                    } else if (i < length - 2 && nextChar == 'z' && text.charAt(i + 2) == '=') {
                        i += 2;
                    }
                }
            } else if (currentChar == 'l' || currentChar == 'n') {
                if (i < length - 1 && text.charAt(i + 1) == 'j') {
                    i++;
                }
            } else if (currentChar == 's' || currentChar == 'z') {
                if (i < length - 1 && text.charAt(i + 1) == '=') {
                    i++;
                }
            }
            count++; // 단어 개수 증가
        }

        System.out.println(count);
    }
}
