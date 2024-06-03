import java.util.*;

class Solution {
    public int solution(String before, String after) {
        
        char[] beforeChars=before.toCharArray();
        char[] afterChars=after.toCharArray();
        
        Arrays.sort(beforeChars);
        Arrays.sort(afterChars);
        
        before=new String(beforeChars);
        after=new String(afterChars);
        
        if(before.equals(after)){
            return 1;
        }else{
            return 0;
        }
        
    }
}