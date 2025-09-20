import java.util.*;

public class Main {
    static ArrayList<Integer>[] tree;
    static boolean[] visited;
    static int deleteNode;
    static int leafCount;
    
    public static void DFS(int node) {
        if(node == deleteNode) {
            return;
        }
        
        visited[node] = true;
        int childCount = 0; 

        for(int child : tree[node]) {
            if(!visited[child] && child != deleteNode) {
                childCount++;
                DFS(child);
            }
        }

        if(childCount == 0) {
            leafCount++;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();  // 노드
        
        tree = new ArrayList[N];
        visited = new boolean[N];
        
        // 트리
        for(int i = 0; i < N; i++) {
            tree[i] = new ArrayList<>();
        }
        
        int root = -1;  // 루트 노드

        for(int i = 0; i < N; i++) {
            int parent = sc.nextInt();
            
            if(parent == -1) {
                root = i;
            } else {
                tree[parent].add(i);
                tree[i].add(parent);
            }
        }
        
        deleteNode = sc.nextInt();
        
        if(deleteNode == root) {
            System.out.println(0);
            return;
        }
        
        leafCount = 0;
        DFS(root);  
        
        System.out.println(leafCount);
    }
}