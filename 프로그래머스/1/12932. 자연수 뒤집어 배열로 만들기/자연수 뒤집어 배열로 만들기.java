class Solution {
    public int[] solution(long n) {
        String numStr = String.valueOf(n);
        int[] answer= new int[numStr.length()]; 
        for(int i =0;i<numStr.length();i++){
            answer[i]=numStr.charAt(numStr.length()-1-i)-'0';
        }
        return answer;
    }
}