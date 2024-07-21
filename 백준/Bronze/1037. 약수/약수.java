
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N= sc.nextInt();
        int []A= new int[N];
        for(int i =0; i<N;i++) {
            int num= sc.nextInt();
            A[i]=num;
        }
        Arrays.sort(A);
        System.out.println(A[0]*A[N-1]);

    }
    // 약수 찾기 문제

    //약수를 찾기 위해서는 1이랑 자기 자신을 뺀 수를 입력해야하는데(배열저장)

    //


}
