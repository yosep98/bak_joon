import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char []text = sc.nextLine().toCharArray();
        for(int i=0 ;i<26;i++) {
            int temp = 0;
            for (int j = 0; j < text.length; j++) {
                temp = -1;
                if (text[j] - 'a' == i) {
                    temp = j;
                    break;
                }
            }
            System.out.print(temp + " ");
        }
    }
}
