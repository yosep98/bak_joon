
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int cnt = 0;
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String text2 = sc.nextLine();
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];

        for (int i = 0; i < text.length(); i++) {
            arr1[text.charAt(i) - 'a']++;
        }
        for (int i = 0; i < text2.length(); i++) {
            arr2[text2.charAt(i) - 'a']++;
        }
        int ans = 0;
        for (int i = 0; i < 26; i++) {
            ans+=Math.abs(arr1[i] - arr2[i]);
        }
        System.out.println(ans);
    }
}
