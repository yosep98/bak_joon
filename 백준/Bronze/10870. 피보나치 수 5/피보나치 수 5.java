import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int p[] = new int[25];
        Scanner sc = new Scanner(System.in);
       p[0]=0;
       p[1]=1;
        int N = sc.nextInt();
        if(N==0)
         p[0]=0;
        else if(N==1)
            p[1]=1;
        else {
        for(int i =2;i<=N;i++){
           p[i]=p[i-1]+p[i-2];
        }
    }
        System.out.println(p[N]);
}

}