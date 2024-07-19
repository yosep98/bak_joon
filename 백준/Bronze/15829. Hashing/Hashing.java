import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int now = 0;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        int N= sc.nextInt();
        char [] text = sc.next().toCharArray();
        for(int j= 0 ;j<N;j++) {
          int V = text[j]-'a'+1;
          sum+=V*(int)Math.pow(31,j);
        }
        System.out.println(sum);
    }
}
