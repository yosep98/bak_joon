
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine(); // 개행 문자 제거
        // 중복 제거를 위한 HashSet 사용
        HashSet<String> words = new HashSet<>();
        for (int i = 0; i < N; i++) {
            words.add(sc.nextLine());
        }
        // 정렬 (길이 오름차순, 길이 같으면 사전 순)
        List<String> sortedWords = new ArrayList<>(words);
        Collections.sort(sortedWords, (s1, s2) -> {
            if (s1.length() != s2.length()) {
                return s1.length() - s2.length(); // 길이 비교
            } else {
                return s1.compareTo(s2); // 사전 순 비교
            }
        });
        // 결과 출력
        for (String word : sortedWords) {
            System.out.println(word);
        }
    }
}
