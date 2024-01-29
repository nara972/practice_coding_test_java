
import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        ArrayList<Integer> divList=new ArrayList<Integer>();
        
        for(int i=0; i<arr.length;i++){
            if(arr[i]%divisor==0){
                divList.add(arr[i]);
            }
        }
        
        if(divList.size()==0){
            answer = new int[1];
            answer[0]=-1;
        }
        else
        {
            answer=new int[divList.size()];
            
            Collections.sort(divList);
            
            for(int i=0; i< divList.size(); i++)
                answer[i]=divList.get(i);
        }
        return answer;
    }
}