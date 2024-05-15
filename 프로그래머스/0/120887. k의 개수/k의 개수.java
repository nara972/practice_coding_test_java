class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        
        String strk=String.valueOf(k);
        
        for(int r=i;r<=j;r++){
            String strr=String.valueOf(r);
            
            if(strr.contains(strk)){
                String[] array=strr.split("");
                for(String alpha:array){
                    if(alpha.equals(strk)) answer++;
                }
            }
            
            
        }
        return answer;
    }
}