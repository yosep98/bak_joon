class Solution {
    public String solution(String s) {
        String[] numbers = s.split(" ");
        int min =Integer.parseInt(numbers[0]);
        int max =Integer.parseInt(numbers[0]);
        for(String numberStr : numbers)
        {
    int number = Integer.parseInt(numberStr);
        min = Math.min(min, number);
        max = Math.max(max, number);    
        }
        
        String answer = String.format("%d %d", min, max); 
        return answer;
    }
}