import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        List<Integer> list = new ArrayList<>();
        int[] answer = new int[score.length];

        for (int i = 0; i < score.length; i++) {
            list.add(score[i]);
            
            if (list.size() > k) {
                // 리스트가 k 크기를 넘을 경우, 최솟값을 제거
                list.remove(Collections.min(list));
            }
            
            // 리스트를 정렬하고 최솟값을 answer에 저장
            Collections.sort(list);
            answer[i] = list.get(0);
        }
        
        return answer;
    }
}
