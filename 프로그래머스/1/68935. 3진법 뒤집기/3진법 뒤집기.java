class Solution {
    public int solution(int n) {
        int ans = 0;
        int max = 0;
        while (true) {
            if (n >= Math.pow(3, max)) {
                max++;
            } else {
                break;
            }
        }
        max--;  
        int[] arr = new int[max + 1];
        int cnt = 0;
        for (int i = max; i >= 0; i--) {
            arr[cnt] = (int)(n / Math.pow(3, i)); 
            n %= Math.pow(3, i);
            cnt++;
        }
        for (int i = 0; i <= max; i++) {
            ans += arr[i] * (int)Math.pow(3, i); 
        }
        return ans;
    }
}
