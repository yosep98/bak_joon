import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());  // 줄 단위 입력으로 받아서 정수로 변환
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());  // 각 줄의 숫자를 배열에 저장
        }

        Arrays.sort(arr);  // 배열 정렬

        for (int i = 0; i < N; i++) {
            bw.write(arr[i] + "\n");  // BufferedWriter를 이용해 출력
        }

        bw.flush();  // 버퍼에 남아 있는 데이터를 출력
        bw.close();  // BufferedWriter를 닫아 자원을 해제
        br.close();  // BufferedReader를 닫아 자원을 해제
    }
}
