import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class Main {
    static int n;
    static int[] a,b;
    static int answer;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        a = new int[n];
        b = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            b[i] = sc.nextInt();
        }
        // 최소값이 나오게 하는법: axb 작은수* 큰수(a 오름차순,b 내림차순 or b 내림차순 a 오름차순)
        Arrays.sort(a);
        Arrays.sort(b);
        for(int i = 0; i < n; i++){
            answer += a[i] * b[n-1-i];  
        }
    System.out.print(answer);
    }
}
