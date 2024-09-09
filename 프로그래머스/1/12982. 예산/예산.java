import java.util.Arrays;
class Solution {
    public int solution(int[] d, int budget) {
        int len=d.length;
        int cnt = 0;
        int sum=0;
        Arrays.sort(d);
        while(cnt<len){
        sum+=d[cnt];
        if(sum<budget)
        cnt++;
        else if(sum==budget)
        {
            cnt++;
            break;
        }
        else
        break;
        }
        return cnt;
    }
}