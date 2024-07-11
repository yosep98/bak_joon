import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int A1=A/100;
        int A2=(A%100)/10;
        int A3=(A%10);
        int AR= A3*100+A2*10+A1;
        int B1=B/100;
        int B2=(B%100)/10;
        int B3=(B%10);
        int BR= B3*100+B2*10+B1;
        if(AR>BR)
            System.out.println(AR);
        else
            System.out.println(BR);
    }
}
