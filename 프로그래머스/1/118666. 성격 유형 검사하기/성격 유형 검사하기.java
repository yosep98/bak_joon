import java.util.*; 
class Solution {
    public String solution(String[] survey, int[] choices) {
       // 해쉬 테이블을 써야하는데? 
       //servey= 입력값 ;["AN", "CF", "MJ", "RT", "NA"]
       //choices= [5, 3, 2, 7, 5] 
       //해시맵으로 성격 유형 저장 
        HashMap<Character, Integer> scores = new HashMap<>();
        scores.put('R', 0);
        scores.put('T', 0);
        scores.put('C', 0);
        scores.put('F', 0);
        scores.put('J', 0);
        scores.put('M', 0);
        scores.put('A', 0);
        scores.put('N', 0);
        //각 질문에 대한 점수 계산 
        for(int i=0; i<survey.length;i++){
            char left = survey[i].charAt(0);
            char right = survey[i].charAt(1);
            int choice = choices[i];
            
            //choice 점수 부여 
            if (choice < 4) {
                // 비동의 (1~3): 왼쪽 유형에 점수
                scores.put(left, scores.get(left) + (4 - choice));
            } else if (choice > 4) {
                // 동의 (5~7): 오른쪽 유형에 점수
                scores.put(right, scores.get(right) + (choice - 4));
            }
    }
        
        // 성격 유형 결정 
        StringBuilder answer = new StringBuilder();
        //RT
        if(scores.get('R')>= scores.get('T')){
        answer.append('R');
        }
        else {
            answer.append('T');
        }
        //CF
        if (scores.get('C') >= scores.get('F')) {  
        answer.append('C');
        } 
        else {
            answer.append('F');
        }
        
        //JM
        if (scores.get('J') >= scores.get('M')) {
        answer.append('J');
        }
        else {
            answer.append('M');
        }
        //AM
        if (scores.get('A') >= scores.get('N')) {
        answer.append('A');
        } 
        else {
        answer.append('N');
        }
        return answer.toString();
        
      
    }
}