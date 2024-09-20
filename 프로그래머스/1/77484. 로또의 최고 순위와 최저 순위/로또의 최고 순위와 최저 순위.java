class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int crr=0;// 몇개 맞았는지 체크 
        int zero=0;
        int rank=6;
        for(int i=0;i<6;i++){
            for(int j=0;j<6;j++){
                if(lottos[i]==win_nums[j]){// 로또 번호 체크
                crr++;
                }
                else if(lottos[i]==0){
                zero++;
                break;
                }
            }
        }
        if(crr<2){
     answer[0]=rank-(crr+zero-1);
     answer[1]=rank;
    if(answer[0]>6){
    answer[0]=6;
    }
        }
    else{
     answer[0]=rank-(crr+zero-1);
     answer[1]=rank-(crr-1);   
    }
        return answer;
    }
}