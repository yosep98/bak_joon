class Solution {
    public int[] solution(long n) {
        String value = String.valueOf(n);
        StringBuilder str = new StringBuilder(value);
        str.reverse(); // StringBuilder를 직접 reverse

        int[] answer = new int[str.length()]; // str.length() 사용

        for (int i = 0; i < answer.length; i++) {
            answer[i] = str.charAt(i) - '0'; // StringBuilder에서 charAt()으로 직접 접근
        }

        return answer;
    }
}