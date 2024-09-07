class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int len=arr1.length;//행의 길이
        int len2=arr2[0].length;//열의 길이
         int[][] ans = new int[len][len2];
        for(int i=0;i<len;i++){
        for(int j=0;j<len2;j++)
        {
            ans[i][j]=arr1[i][j]+arr2[i][j];
        }
    }
        return ans;}
}