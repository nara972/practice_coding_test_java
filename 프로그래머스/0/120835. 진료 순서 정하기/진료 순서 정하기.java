class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int temp=1;
        
        for(int i=0; i<emergency.length;i++){
            temp=1;
            for(int j=0;j<emergency.length;j++){
             if(emergency[i]<emergency[j]){
                 temp+=1;
             }
            }
            answer[i]=temp;
        }
        return answer;
    }
}