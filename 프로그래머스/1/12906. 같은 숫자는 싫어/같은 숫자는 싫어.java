import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
       
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");
        
        Stack<Integer> stack=new Stack<>();
        
        for(int n:arr){
            if(stack.isEmpty() || stack.peek()!=n){
                stack.push(n);
            }
        }
        
        int[] answer=new int[stack.size()];
        int index=0;
        
        for(int n:stack){
            answer[index++]=n;
        }
        return answer;

    }
}