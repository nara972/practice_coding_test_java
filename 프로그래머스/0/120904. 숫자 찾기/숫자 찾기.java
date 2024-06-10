class Solution {
    public int solution(int num, int k) {
        
        String num_str=Integer.toString(num);
        String[] strArr = num_str.split("");
        
        for(int i=0;i<strArr.length;i++){
            if(strArr[i].equals(Integer.toString(k))) {
                return i+1;
            }
        }
        return -1;
    }
}