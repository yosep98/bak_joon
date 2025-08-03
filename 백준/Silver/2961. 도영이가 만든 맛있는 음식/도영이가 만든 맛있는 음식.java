import java.util.Scanner;

public class Main {
    // 음식 재료 개수
    static int n;
    static int sum;
    static int min=Integer.MAX_VALUE;
    static int[] s,b;
    // 신맛은 곱
    // 쓴맛은 합
    public static void DFS(int L,int s1,int b1,boolean used){
        // 도달 했을 경우
        if(L==n){
            if(used==true){
            sum=Math.abs(s1-b1);
            if(sum<min){
                min=sum;
            }
            }
        }
        else{
            DFS(L+1,s1*s[L],b1+b[L],true);// 음식추가하기
            DFS(L+1,s1,b1,used);//음식추가하지 않기
        }

    }
    //신맛과 쓴맛이 주어졌을때 쓴맛신맛 차이가 가장 작게
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        n = sc.nextInt();
        s = new int[n];
        b = new int[n];
        for(int i=0;i<n;i++){
            s[i]=sc.nextInt();
            b[i]=sc.nextInt();
        }
        DFS(0,1,0,false);
        System.out.println(min);
    }
}
