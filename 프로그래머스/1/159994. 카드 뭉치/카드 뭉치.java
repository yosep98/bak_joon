class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int num1 = -1;
        int num2 = -1;
        
        for(int i = 0; i < goal.length; i++) {
            boolean found = false;
            
            for(int j = 0; j < cards1.length; j++) {
                if(goal[i].equals(cards1[j]) && num1+1==j) {
                    num1 = j;
                    found = true;
                    break;
                }
            }
          
            if (!found) {
                for(int j = 0; j < cards2.length; j++) {
                    if(goal[i].equals(cards2[j]) && num2+1==j) {
                        num2 = j;
                        found = true;
                        break;
                    }
                }
            }
            if (!found) {
                return "No";
            }
        }
        
        return "Yes";
    }
}
