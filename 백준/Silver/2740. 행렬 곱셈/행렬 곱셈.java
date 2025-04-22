import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[][] arr= new int[N][M];
		int num=0;
		// N번 반복 그리고 M번의 원소를 받아야함
		for(int i=0;i<N;i++){
			for(int j=0;j<M;j++){
				arr[i][j]=sc.nextInt();
			}
		}
		int M2 = sc.nextInt();
		int K = sc.nextInt();
		int[][] arr2= new int[M2][K];
		//정답 행렬
		int[][] ans =new int[N][K];
		//M번 반복 K번의 원소를 받아야함
		for(int i=0;i<M2;i++){
			for(int j=0;j<K;j++){
				arr2[i][j]=sc.nextInt();
			}

		}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < K; j++) {
				for (int x = 0; x < M; x++) {
					ans[i][j] += arr[i][x] * arr2[x][j];
				}
			}
		}
		for(int i=0;i<N;i++){
			for(int j=0;j<K;j++){
				System.out.print(ans[i][j]+" ");
			}
			System.out.println();
		}
	}
}
