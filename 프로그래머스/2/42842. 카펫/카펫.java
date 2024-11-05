class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        
        int area = brown + yellow;
        
        for(int i=3;i<=area;i++){
            int col=i;
            int row = area/col;
            
            if(row<3){
                continue;
            }
            
            if(row>=col){
                if((row-2)*(col-2) == yellow){
                    answer[0]=row;
                    answer[1]=col;
                    return answer;
                }
            }
        }
        return answer;
    }
}