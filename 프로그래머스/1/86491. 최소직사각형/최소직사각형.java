class Solution {
    public int solution(int[][] sizes) {
        int maxWidth = 0;
        int maxHeight = 0;

        for (int[] size : sizes) {
          
            int width = Math.min(size[0], size[1]);
            int height = Math.max(size[0], size[1]);
            
        
            maxWidth = Math.max(maxWidth, width);
            maxHeight = Math.max(maxHeight, height);
        }

        
        return maxWidth * maxHeight;
    }
}
