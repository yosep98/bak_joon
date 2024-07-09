
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char []word =sc.next().toCharArray(); // char-> array
        int []result = new int[26];
        for (int i=0;i<word.length;i++){
            result[word[i]-97]++;
        }
        for(int i=0; i<result.length;i++) {
            System.out.print(result[i]+" ");
        }
        }
}
