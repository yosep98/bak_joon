import java.util.*;

public class Main {
    static int[] ch;
    static int start;
    static int end;
    static int L;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ch = new int[100001]; 
        start = sc.nextInt();
        end = sc.nextInt();
         if (start == end) {
        System.out.println(0);
    }
        else
        BFS(start);
    }

    public static void BFS(int s) {
        Queue<Integer> q = new LinkedList<>();
        q.add(s);
        ch[s] = 1;
        L = 0;

        while (!q.isEmpty()) {
            int size = q.size();
             for (int i = 0; i < size; i++) {
                int x = q.poll();
                // 여기서 x+1 혹은 x-1 혹은 x *2 더해야함 근데 배열에서 이걸 표현할수 있나
                 for (int j = 1; j <= 3; j++) {
                    int nx;
                    if (j == 1) nx = x + 1;
                    else if (j == 2) nx = x - 1;
                    else nx = x * 2;

            
                    if (nx == end) {
                        System.out.println(L + 1);
                        return;
                    }
                    if (nx >= 0 && nx <= 100000 && ch[nx] != 1) {
                        ch[nx] = 1;
                        q.add(nx);
                    }
                }
            }
            L++;
        }
    }
}
