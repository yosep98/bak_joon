
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp=0;
        int N=  sc.nextInt();
        int M = sc. nextInt();
        int[] arr  = new int[N+1];
        for(int j= 1;j<=N;j++)// N만큼의 배열 생성
        {
            arr[j]=j;
        }
        for (int i=1; i<=M;i++)//M 번의 배열 변경
        {
        int I = sc.nextInt();
        int J = sc.nextInt();
        temp= arr[I];
        arr[I]=arr[J];
        arr[J]=temp;
        }
        for(int k=1; k<=N;k++)
        System.out.print(arr[k]+" ");
    }
}
