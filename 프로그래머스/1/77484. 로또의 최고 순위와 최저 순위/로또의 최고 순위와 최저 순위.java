class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int matched=0,zero=0;
        for(int l:lottos){
            if(l==0){
                zero++;
            }else{
            for(int win:win_nums){
                if(l==win){
                    matched++;
                }
            }
            }
        }
        int min=matched;
        int max=matched+zero;
        int[] answer = {Math.min(7-max,6),Math.min(7-min,6)};
        return answer;
        
    }
}