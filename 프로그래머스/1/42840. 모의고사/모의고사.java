class Solution {
    public int[] solution(int[] answers) {
        int arr1[] ={1,2,3,4,5};
        int arr2[]={2,1,2,3,2,4,2,5};
        int arr3[]={3,3,1,1,2,2,4,4,5,5};
        int yes[]=new int[3];
        for(int i=0;i<answers.length;i++){
        if(answers[i]==arr1[i%arr1.length])
            yes[0]++;
        if (answers[i]==arr2[i%arr2.length])
            yes[1]++;
        if(answers[i]==arr3[i%arr3.length])
            yes[2]++;
        }
        int maxScore = Math.max(yes[0], Math.max(yes[1], yes[2]));
        int cnt=0;
        for(int i=0;i<yes.length;i++){
            if(yes[i]==maxScore){
                cnt++;
            }
        }
        int[] ans = new int[cnt];
        int idx = 0; 
        for (int i = 0; i < yes.length; i++) {
            if (yes[i] == maxScore) {
                ans[idx++] = i + 1; 
            }
        }

        return ans;
    }
}