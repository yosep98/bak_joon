import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	static int[][] map;         // 인접행렬
	static boolean[] visit;     // 방문 체크 배열
	static int n;               // 컴퓨터 수
	static int count = 0;       // 감염된 컴퓨터 수

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();       // 정점 수 (컴퓨터 수)
		int m = sc.nextInt();   // 간선 수 (연결된 컴퓨터 쌍)

		map = new int[n + 1][n + 1];     // 인접 행렬 생성
		visit = new boolean[n + 1];      // 방문 배열 생성

		// 간선 정보 입력
		for (int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			map[a][b] = map[b][a] = 1;   // 무방향 그래프
		}

		// BFS 탐색 시작 (1번 컴퓨터부터)
		System.out.println(bfs(1));
	}

	public static int bfs(int start) {
		Queue<Integer> q = new LinkedList<>();
		q.offer(start);
		visit[start] = true;

		while (!q.isEmpty()) {
			int current = q.poll();

			for (int i = 1; i <= n; i++) {
				// 연결되어 있고 아직 방문하지 않았다면
				if (map[current][i] == 1 && !visit[i]) {
					q.offer(i);         // 큐에 추가
					visit[i] = true;    // 방문 처리
					count++;            // 감염된 컴퓨터 수 증가
				}
			}
		}

		return count;
	}
}
