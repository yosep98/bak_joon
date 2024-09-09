import java.util.Arrays;
class Solution {
    public int solution(int[] d, int budget) {
        int cnt=0;
        int sum=0;
        Arrays.sort(d);
        while(cnt<d.length){
        sum+=d[cnt];
        if(sum<=budget)
        cnt++;
        else
        break;
        }
        return cnt;
    }
}