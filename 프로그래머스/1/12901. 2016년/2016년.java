class Solution {
    public String solution(int a, int b) {
        int temp=-1;
        String[] daysOfWeek = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        int[] daysInMonth = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for(int i=0;i<a-1;i++){
        temp+=daysInMonth[i];
        }
        temp+=b;
        int index=(temp+5)%7;
        String answer=daysOfWeek[index];
        return answer;
    }
}