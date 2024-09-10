class Solution {
    public String solution(int[] food) {
        StringBuilder ans = new StringBuilder();
        StringBuilder revers = new StringBuilder();
        
        for (int i = 1; i < food.length; i++) {
            int d = food[i] / 2; 
            for (int j = 0; j < d; j++) {
                ans.append(i); 
            }
        }
        ans.append('0');
        for (int i = food.length - 1; i >= 1; i--) {
            int d = food[i] / 2;
            for (int j = 0; j < d; j++) {
                revers.append(i); 
            }
        }
        ans.append(revers);
        return ans.toString();
    }
}