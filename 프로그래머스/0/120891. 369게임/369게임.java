class Solution {
    public int solution(int order) {
        int answer = 0;
        
        String s=Integer.toString(order);
        String[] intArr=s.split("");
        
        for(int i=0;i<intArr.length;i++){
            if(intArr[i].equals("3") || intArr[i].equals("6") || intArr[i].equals("9"))
            answer++;
        }
        return answer;
    }
}