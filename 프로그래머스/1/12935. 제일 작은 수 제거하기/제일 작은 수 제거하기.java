class Solution {
    public int[] solution(int[] arr) {
        if(arr.length==1){
            int[] answer_one={-1};
            return answer_one;
        }
        
        int[] answer=new int[arr.length-1];
        
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            min=Math.min(min,arr[i]);
        }
        int answer_num=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==min){
                continue;
            }else{
                answer[answer_num++]=arr[i];
            }
        }
        return answer;
    }
}