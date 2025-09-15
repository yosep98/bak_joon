import java.util.*;

public class Main {
    static ArrayList<Integer>[] graph;
    static boolean[] visited;
    static int n;

    public static int BFS(int start, int target) {
        Queue<int[]> queue = new LinkedList<>();
        visited = new boolean[n + 1];

        queue.offer(new int[]{start, 0});  
        visited[start] = true;

        while(!queue.isEmpty()) {
            int[] current = queue.poll();
            int person = current[0];
            int distance = current[1];

            if(person == target) {
                return distance;
            }

         
            for(int next : graph[person]) {
                if(!visited[next]) {
                    visited[next] = true;
                    queue.offer(new int[]{next, distance + 1});
                }
            }
        }

        return -1;  
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();  // 전체

        int p1 = sc.nextInt();  
        int p2 = sc.nextInt();  

        int m = sc.nextInt();  

        // 그래프 초기화
        graph = new ArrayList[n + 1];
        for(int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }

  
        for(int i = 0; i < m; i++) {
            int parent = sc.nextInt();
            int child = sc.nextInt();

            graph[parent].add(child);  
            graph[child].add(parent);  
        }

        // BFS
        int result = BFS(p1, p2);
        System.out.println(result);
    }
}