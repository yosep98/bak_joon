import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N= sc. nextInt();
        int num=2;
        while (true){
        if(N%num==0)
        {
            System.out.println(num);
            N=(N/num);
            num=2;
        }
        else
        num++;
        if(N<num)
            break;
        //브레이크를 어떻게 걸어야할까??
        }

    }
}
