class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];
        
        int count=money/5500;
        int remain=money%5500;
        
        answer[0]=count;
        answer[1]=remain;
            
        return answer;
    }
}