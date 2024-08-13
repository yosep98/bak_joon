import java.util.*;
class Solution {
    public long solution(long n) {
        String str= String.valueOf(n);
        char[] charArr = str.toCharArray();
        Arrays.sort(charArr);
        StringBuilder sb = new StringBuilder(new String(charArr));
        String sortedStr = sb.reverse().toString();
        return Long.parseLong(sortedStr);
    }
}