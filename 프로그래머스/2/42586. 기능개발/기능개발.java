import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> result = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        
        for (int i = 0; i < progresses.length; i++) {
            int remainingWork = 100 - progresses[i];
            int daysRequired = (int) Math.ceil((double) remainingWork / speeds[i]);
            queue.offer(daysRequired);
        }
        
        while (!queue.isEmpty()) {
            int currentDeployDay = queue.poll(); 
            int count = 1;
            
            while (!queue.isEmpty() && queue.peek() <= currentDeployDay) {
                count++;
                queue.poll();
            }
            
            result.add(count); 
        }
        
        return result.stream().mapToInt(i -> i).toArray();
    }
}