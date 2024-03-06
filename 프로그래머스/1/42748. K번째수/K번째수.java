import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for(int i=0;i<commands.length;i++){
            
            int StartIndex=commands[i][0];
            int EndIndex=commands[i][1];
            int selectIndex=commands[i][2];
            
            int[] splitArray=new int[EndIndex-StartIndex+1];
            
            int index=0;
            
            for(int j=StartIndex-1;j<EndIndex;j++){
                splitArray[index]=array[j];
                index++;
            }
            
            Arrays.sort(splitArray);
            answer[i]=splitArray[selectIndex-1];
            
        }
        
    
        return answer;
    }
}