import java.util.Scanner;
import java.util.Stack;

public class Main {
    static int n ;// 줄
    static int start=0;
    static int value; // 원소
    public static void main(String args[]) {
        StringBuilder sb=new StringBuilder();
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        n = sc.nextInt();
        // n번 반복
        for (int i = 0; i <n ; i++) {
            value = sc.nextInt();
            if(start<value){
                for(int j=start+1;j<=value;j++){
                    stack.push(j);
                    sb.append('+').append('\n');
                }
              start=value;
            }
            if (!stack.isEmpty() && stack.peek() != value){
                System.out.println("NO");
                return;
            }
            stack.pop();
            sb.append('-').append('\n');
        }
        System.out.println(sb);
        sc.close();
    }

}
