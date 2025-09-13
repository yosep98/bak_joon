
import java.util.*;

public class Main {
    
    public static long power(long a, long b, long c) {
        if(b == 0) return 1;
        if(b == 1) return a % c;

        
        if(b % 2 == 0) {  
            long half = power(a, b/2, c);
            return (half * half) % c;
        } else { 
            return (a * power(a, b-1, c)) % c;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long A = sc.nextLong();  // 자연수 A
        long B = sc.nextLong();  // 지수 B  
        long C = sc.nextLong();  // 나누기 수 C

        System.out.println(power(A, B, C));
    }
}