import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num=0;
        long[] F = new long[n+1];
        for(int i =0;i<n+1;i++)
        {
            if(i==0)
            {
                num=0;
                F[i]=num;
            }
            else if(i==1||i==2)
            {
                num=1;
                F[i]=num;
            }
            else {
                F[i]=F[i-1]+F[i-2];
            }
        }
        System.out.println(F[n]);
    }
}
